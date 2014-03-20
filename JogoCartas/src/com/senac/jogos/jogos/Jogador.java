package com.senac.jogos.jogos;

public class Jogador {
	
	private int pontos;
	private static boolean pula;
	
	public Jogador(){
		this.pontos = 0;
		this.pula = false;
	}
	
	public int getPontos(){
		return pontos;
	}
	
	public void addPontos(int amount){
		pontos += amount;
	}
	
	public void subtractPontos(int amount){
		pontos -= amount;
	}
	
	public void setPontos(int pontos){
		this.pontos = pontos;
	}
	
	public static boolean getPula(){
		return pula;
	}
	
	public static void setPula(boolean op){
		pula = op;
	}
	

}
