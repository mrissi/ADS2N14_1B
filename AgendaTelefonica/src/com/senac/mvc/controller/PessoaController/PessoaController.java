package com.senac.mvc.controller.PessoaController;

import java.util.Random;

import com.senac.mvc.model.Pessoa.Pessoa;

public class PessoaController {
	
	private Pessoa contato;
	Random numero = new Random();
		
	public void criarContato(){
		for(int i=0; i<50; i++){
			contato = new Pessoa();
			contato.setNome(nomes[numero.nextInt(7)] + sobrenome[numero.nextInt(7)]);
			contato.setTelefone("555-" + numero.nextInt(9999));
			contato.setEndereco("Rua " + nomes[numero.nextInt(7)] + sobrenome[numero.nextInt(7)]);
			
			System.out.println("Nome:..... " + contato.getNome());
			System.out.println("Telefone:. " + contato.getTelefone());
			System.out.println("Endereço:. " + contato.getEndereco() + "\n");
		}
		
	}
	
	//VETOR DE NOMES
	String[] nomes = {"Ana ", "Carlos ", "Daniela ", "Fabio ", "Fernanda ", "Lucas ", "Mauricio ", "Natalia "};
	
	//VETOR DE SOBRENOMES
	String[] sobrenome = {"da Silva", "dos Santos", "Lima", "Souza", "Freitas","Fagundes","de Oliveira","Nascimento"};

}
