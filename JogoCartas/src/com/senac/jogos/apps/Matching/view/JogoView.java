package com.senac.jogos.apps.Matching.view;

import java.util.Scanner;
import static java.lang.System.*;
import com.senac.jogos.apps.Matching.controller.JogoController;
import com.senac.jogos.jogos.Jogador;

public class JogoView {
	
	private static Scanner teclado = new Scanner(System.in);
	private static JogoController controller = new JogoController();
	
	
	public static void main(String[] args){
		
		int play = 1;
		int i = 0;
		boolean valida = false;
		
		//INICIANDO A QTDE DE JOGADORES
		do {
			out.println("--------- Novo Jogo -------");
			out.println("Informe a QTDE de jogadores");
			play = teclado.nextInt();
			if (play > 0 && play <= 4){
				valida = true;
			}
			else{
				out.println("\n*********** ATENÇÃO *************");
				out.println("* Mínimo 1 e Máximo 4 Jogadores *");
				out.println("*********************************\n");
				valida = false;
			}	
		} while (valida == false);
		out.println("---------------------------\n");
		
		//CRIANDO JOGADORES
		Jogador[] jogadores = new Jogador[4];
		for(i=0; i<play; i++){
			jogadores[i] = new Jogador();
		}
		
		//INICIANDO JOGADAS
		play = 1;
		
		//INICIANDO JOGO - VIRANDO CARTA NA MESA
		out.println("Carta na mesa: " + controller.showMesa());
		out.println(controller.getQtdeCartas());
		
		do{
			//JOGADAS
			out.println("Qual sua Jogada?");
			out.println("1 - Jogar");
			out.println("2 - Passar a vez");
			
			int comando = teclado.nextInt();
			
			//JOGAR
			if(comando == 1){
				out.println("Carta do jogador: " + controller.showCartaJogador());
				controller.playTurno();
				
				out.println("\nCarta na mesa: " + controller.showMesa());
				out.println("Jogadas restantes: " + controller.getQtdeCartas());
			}
			
			//PULA TURNO
			else{
				
			}
		
		// else pula turno
		
			out.println("Pontos do Jogador: " + controller.showJogador());
			
		} while (controller.getQtdeCartas() > 0);
		
	}

}
