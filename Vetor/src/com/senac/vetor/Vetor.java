package com.senac.vetor;


public class Vetor<T> {
	
	private Object[] dados;
	private int numDados;
	
	public Vetor(){
		this.dados = new Object[0];
	}
	
	public void insert(int index, int valor){
		aumentarTamanhoDados();
		System.arraycopy(this.dados, index, this.dados, index+1, getSize()-index-1);
		this.dados[index] = valor;
		numDados++;
	}
	
	public void append(int valor){
		int index = this.dados.length;
		aumentarTamanhoDados();
		this.dados[index] = valor;
		numDados++;
	}
	
	private void aumentarTamanhoDados() {
		Object[] novo = new Object[dados.length + 1];
		System.arraycopy(this.dados, 0, novo, 0, dados.length);
		this.dados = novo;
	}
	
	public void remove(int index){
		System.arraycopy(this.dados, index+1, this.dados, index, getSize());
		numDados--;
	}
	 
	public int getSize(){
		return numDados;
	}
	
	public int get(int index){
		return this.dados[index];
	}

	public static void main(String[] args) {
		
		Vetor v = new Vetor();
		v.append(2);
		v.append(3);
		v.append(4);
		v.append(5);
		v.append(1);
		v.insert(2, 9);
		v.remove(v.getSize()-1);
		for(int i = 0; i<v.getSize(); i++){
			System.out.println(v.get(i));
		}
		
	}

}
