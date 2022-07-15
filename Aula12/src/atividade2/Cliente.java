package atividade2;

public class Cliente {
	private String nome;

	//construtor vazio
	public Cliente() {
		super();
	}
	//Contrutor com parametro
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return 
				"Nome: " + nome;
	}
	
	
	
	
	
}
