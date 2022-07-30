package model;

public abstract class Pessoa {
	private String nome;
	

	
	public abstract String imprimeDados();
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getNome() {
		return this.nome;
	}

}
