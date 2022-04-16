package Exercitando;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	
	private String nome;
	private Endereco endereco; // um contato tem um endereço
	// Um contato tem vários telefones
	List<Telefone> telefones = new ArrayList<>();
	
	public Contato() {
		
	}

	public Contato(String nome, Endereco endereco, List<Telefone> telefones) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones(Telefone telefoneCelular) {
		return telefones;
	}

	public void setContatos(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
}
