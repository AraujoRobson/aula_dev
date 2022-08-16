package model;

public class Cliente {
	private String nome;
	
	public Cliente() {
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
