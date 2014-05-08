package com.senac.app.model;

import com.senac.app.estrutura.Vetor;

public class Passo {
	
	private String descricao;
	private Vetor ingredientes

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addIngrediente(Ingrediente ingrediente){
		ingrediente.add(ingrediente);
	}

}
