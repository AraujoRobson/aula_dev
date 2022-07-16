package atividade.polimorfismo1;

public class Livros extends Estoque {
	

	private String autor;
	
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}


	@Override
	public String toString() {
		return super.toString() +
				"\nAutor: " + autor + "\n------------";
	}
	
	

}
