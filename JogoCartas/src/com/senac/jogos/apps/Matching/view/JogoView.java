package com.senac.jogos.apps.Matching.view;

import java.util.Scanner;
import static java.lang.System.*;
import com.senac.jogos.apps.Matching.controller.JogoController;

public class JogoView {
	
	private static Scanner teclado = new Scanner(System.in);
	private static JogoController controller = new JogoController();
	
	public static void main(String[] args){
		
		out.println("Carta na mesa: " + controller.showMesa());
		out.println("Qual sua jogada?/n" + "J - Jogar/n" + "P - Passar a vez");
		
		String comando = teclado.next();
		if(comando.equalsIgnoreCase("J")){
			out.println("Carta do jogador: " + controller.showCartaJogador());
			controller.playTurno();
		}
		
		// else pula turno
		
		out.println("Pontos do Jogador: " + controller.showJogador());
		
	}

}
