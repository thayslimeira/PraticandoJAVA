package Exercitando;

public class Lampada {

	private boolean estado; //LIGADA OU DESLIGADA

	public Lampada() {
		this.estado = false;
	}

	public boolean isEstado() {
		return estado;
	}

	//METODO QUE SETA O ESTADO DA LAMPADA
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//METODO QUE MUDA O ESTADO DA LAMPADA
	
	public boolean getEstado() {
		return this.estado;
		
	}
	
}
