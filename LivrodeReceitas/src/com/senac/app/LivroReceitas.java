package com.senac.app;

import com.senac.app.View.ConsoleView;
import com.senac.app.model.Ingrediente;
import com.senac.app.model.UnidadeMedida;

public class LivroReceitas {


	public static void main(String[] args) {
		
		(new LivroReceitas()).run();
	}
	
	public void imprimi()
	
	private void run(){
		UnidadeMedida gramas = new UnidadeMedida();
		gramas.setGrandeza("massa");
		gramas.setNome("Gramas");
		gramas.setUnidade("g");
		
		Ingrediente farinha = new Ingrediente();
		farinha.setNome("Farinha de Trigo");
		farinha.setQuantidade(500);
		farinha.setMedida(gramas);
		
		ConsoleView view = new ConsoleView();
		view.showMessage(
				String.format("%0f%s %s",
						farinha.getQuantidade(),
						farinha.getNome(),
						farinha.getMedida()));
		
		imprime(farinha);
	}

}
