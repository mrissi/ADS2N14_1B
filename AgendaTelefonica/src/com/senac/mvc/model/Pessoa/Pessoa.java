package com.senac.mvc.model.Pessoa;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String endereco;
	
	//NOME
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	//TELEFONE
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	//ENDEREÇO
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
}
