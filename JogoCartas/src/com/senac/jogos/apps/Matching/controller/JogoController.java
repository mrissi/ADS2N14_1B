package com.senac.jogos.apps.Matching.controller;

import com.senac.jogos.cartas.Carta;
import com.senac.jogos.jogos.Jogador;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;

public class JogoController {
	
	private MatchingCardGame jogo;
	private Carta cartaJogador;
	private static int qtdeCartas;
		
	public JogoController(){
		jogo = new MatchingCardGame();
		cartaJogador = null;
	}
	
	public void playTurno(){
		int pontos = -1;
		// descartar carta
		if(Jogador.getPula() == false){
			pontos = jogo.matchCarta(cartaJogador);
			jogo.getJogador().addPontos(pontos);
			jogo.setMesa(cartaJogador);
			cartaJogador = null;
		}
		else{
			pontos = -1;
			jogo.getJogador().addPontos(pontos);
		}	
	}
	
	public String showJogador(){
		return String.format("Pontos: %d", jogo.getJogador().getPontos());
	}
	
	public String showCarta(Carta carta){
		return String.format("%d%c", carta.getValor(), carta.getNaipe());
	}
	
	public String showMesa(){
		return showCarta(jogo.getMesa());
	}
	
	public String showCartaJogador(){
		if(cartaJogador == null)
			cartaJogador = jogo.drawCarta();
		return showCarta(cartaJogador);
	}
	
	public static void setQtdeCartas(int qtde){
		qtdeCartas = qtde;
	}
	
	public int getQtdeCartas(){
		return qtdeCartas;
	}
	
	public boolean passaVez(){
		return  Jogador.getPula();
	}
	
	public void setPassaVez(boolean passa){
		Jogador.setPula(passa);
	}
	
	
}
