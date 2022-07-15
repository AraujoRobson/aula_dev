package atividade2;

public class Peixe extends Animal{

	public Peixe(String nome, String caracteristica, double comprimento, double velocidade) {
		super(nome, caracteristica,comprimento, velocidade);
	}

	

	public void alteraCaracteristica(String caracteristica) {
		setCaracteristica(caracteristica);
	}



	@Override
	public String toString() {
		return super.toString() + 
				"\nCaracteristica: " + getCaracteristica();
	}
	
	
	
	

}
