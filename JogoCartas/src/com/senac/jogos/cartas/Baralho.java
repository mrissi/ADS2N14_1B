package com.senac.jogos.cartas;

public class Baralho {
	
	private Carta[] cartas = new Carta[52];
	private int numCartas;
	
	public Baralho()
	{
		char[] naipes = new char[4];
		naipes[0] = 'C';
		naipes[1] = 'O';
		naipes[2] = 'P';
		naipes[3] = 'E';
		
		for (char naipe: naipes)
		{
			for (int valor = 1; valor <= 13; valor++)
			{
				cartas[numCartas] = new Carta(naipe,valor);
				numCartas++;
			}
		}
				
	}
	
	public Carta drawCarta()
	{
		int carta = (int)(Math.random() * numCartas);
		Carta sorteada = cartas[carta];
		
		numCartas--;
		
		cartas[carta] = cartas[numCartas];
		
		return sorteada;
	}

}
