package atividade.polimorfismo1;

public class Estoque {

	private String nome;
	protected double preco;
	
	

	
	public Estoque(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + 
				"\nPreco: " + preco;
	}

	
	
	
}
