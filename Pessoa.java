package Pessoa;


public class Pessoa {
	String nome;
	String cor;
	String sexo;
	String endereco;
	int idade;
	int cpf;
	int tel;

	public Pessoa(String nome){
		this.nome = nome;
		this.cor = "";
		this.sexo = "";
		this.endereco = "";
		this.idade = 0;
		this.cpf = 0;
		this.tel = 0;
	}

	public Pessoa(){

	}

	// NOME
	public void setNome(String n){
		nome = n;
	}

	public String getNome(){
		return this.nome;
	}

	// COR
	public void setCor(String c){
		cor = c;
	}

	public String getCor(){
		return this.cor;
	}

	// SEXO
	public void setSexo(String s){
		sexo = s;
	}

	public String getSexo(){
		return this.sexo;
	}

	// ENDEREÇO
	public void setEndereco(String e){
		sexo = e;
	}

	public String getEndereco(){
		return this.endereco;
	}

	// IDADE
	public void setIdade(int i){
		idade = i;
	}

	public int getIdade(){
		return this.idade;
	}

	// CPF
	public void setCpf(int c){
		cpf = c;
	}

	public int getCpf(){
		return this.cpf;
	}

	// TELEFONE
	public void setTelefone(int t){
		tel = t;
	}

	public int getTelefone(){
		return this.tel;
	}

	// SAÍDA
	public String toString(){
		String saida;
		saida = "Nome:\t\t" + getNome();
		saida = saida + "\nCor:\t\t" + getCor();
		saida = saida + "\nSexo:\t\t" + getSexo();
		saida = saida + "\nIdade:\t\t" + getIdade();
		saida = saida + "\nEndereço:\t" + getEndereco();
		saida = saida + "\nCPF:\t\t" + getCpf();
		saida = saida + "\nTelefone:\t\t" + getTelefone();
		return saida;
	}

}