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
				out.println("\n*********** ATEN��O *************");
				out.println("* M�nimo 1 e M�ximo 4 Jogadores *");
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
		
		
		//INICIANDO JOGO - VIRANDO CARTA NA MESA
		out.println("Carta na mesa: " + controller.showMesa());
		out.println(controller.getQtdeCartas());
		
		int comando;
		
		do{
			//JOGADAS
			out.println("Qual sua Jogada?");
			out.println("1 - Jogar");
			out.println("2 - Passar a vez");
				
			comando = teclado.nextInt();
				
			//JOGAR
			if(comando == 1){
				out.println("Carta do jogador: " + controller.showCartaJogador());
				controller.playTurno();
				controller.setPassaVez(false);
					
				out.println("\nCarta na mesa: " + controller.showMesa());
				out.println("Jogadas restantes: " + controller.getQtdeCartas());
			}
				
			//PULA TURNO
			else{
				if(controller.passaVez() == false){
					System.out.println("Voc� passou a vez perde 1 ponto");
					controller.setPassaVez(true);
					controller.playTurno();
				}
				else
					System.out.println("N�o pode passar a vez.");
			}
			out.println("Pontos do Jogador: " + controller.showJogador());
			
		} while (controller.getQtdeCartas() > 0);
		
		out.println("\n***************************");
		out.println("Resultado final:");		
		out.println("Pontos do Jogador: " + controller.showJogador());
	}

}
