package atividade.polimorfismo1;

public class DVDs extends Estoque{
	
	private double duracao;

	public DVDs(String nome, double preco, double duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nDuração:" + duracao + "\n------------";
	}
	
	
	

}
