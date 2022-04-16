package Exercitando;

public class ContatoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Endereco endereco = new Endereco ("Av Presidente Kennedy", 123, "Recife");
		Telefone telefoneCelular = new Telefone("celular", "81", "8723829382");
		
		Contato contato = new Contato();
		contato.setNome("Thays");
		contato.setEndereco(endereco);
		contato.getTelefones(telefoneCelular);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco().getRua()+ " - " + contato.getEndereco().getEstado());
			
	}

}
