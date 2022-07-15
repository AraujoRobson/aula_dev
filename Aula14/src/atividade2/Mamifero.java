package atividade2;

public class Mamifero extends Animal {

	

	public Mamifero(String nome, String cor, String alimento, double comprimento, double velocidade, int numPatas) {
		super(nome, cor, alimento, comprimento, velocidade, numPatas);
	}

	public void alteraAlimento(String alimento) {
		setAlimento(alimento);
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nAlimento: " + getAlimento();
	}
	
	

	
	
	

}
