package Exercitando;

public class Endereco {

	
	private String rua;
	private int numero;
	private String estado;
	
	
	public Endereco(String rua, int numero, String estado) {
		
		this.rua = rua;
		this.numero = numero;
		this.estado = estado;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
