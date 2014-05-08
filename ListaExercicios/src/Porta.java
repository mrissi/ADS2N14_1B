import javax.swing.text.ChangedCharSetException;


public class Porta {
	private boolean aberta;
	private boolean trancada;
	private int fechadura;
	
	//CONSTRUTOR
	public Porta(int fechadura){
		this.aberta = false;
		this.trancada = true;
		this.fechadura = fechadura;
	}
	
	//STATUS E ALTERAÇÕES [ ABERTA ]
	public boolean isAberta(){
		return aberta;
	}
	
	public void abrir(){
		throws PortaTrancadaException
		{
			if (trancada)
				throw new PortaTrancadaException();
			aberta = true;
		}
		
	}
	public void fechar(){
		aberta = false;
	}
	
	//STATUS E ALTERAÇÕES [ FECHADA ]
	public boolean isTrancada(){
		return trancada;
	}
	
	public void trancar(Chave chave)
		throws ChaveInvalidaException
		{
		if(chave.getCodigo() == fechadura)
			trancada = true;
		else
			throws new ChaveInvalidaException();
		}
			
	public void destrancar(Chave chave){
		if(chave.getCodigo() == fechadura)
			trancada = false;
		
	}

}
