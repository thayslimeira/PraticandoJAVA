package Exercitando;

public class LampadaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CRIA O OBJETO LAMPADA
		Lampada luz = new Lampada();
		
		//LIGANDO A LAMPADA
		luz.setEstado(true);
		System.out.println("L�mpada acesa!!!");
		
		//DESLIGANDO A LAMPADA
		luz.setEstado(false);
		System.out.println("L�mpada apagada!!!");
	}

}
