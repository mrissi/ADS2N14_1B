
public class Comodo {
	
	private String tipoComodo;
	private String cor;
	private double tamanho;
	private Lampada lampada;
	
	//CONSTRUTOR
	public Comodo(){
		this.cor = "";
		this.tamanho = 0;
		this.tipoComodo = "";
		this.lampada = new Lampada();
	}
	
	//LAMPADA
	public void setIluminacao(boolean iluminado){
		if(iluminado)
			lampada.ligar();
		else
			lampada.desligar();
	}
	public boolean isIluminado(){
		return lampada.isLigado();
	}
	
	//TIPO DE COMODO
	public String getTipoComodo() {
		return tipoComodo;
	}
	public void setTipoComodo(String tipoComodo) {
		this.tipoComodo = tipoComodo;
	}
	
	//COR
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//TAMANHO
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

}
