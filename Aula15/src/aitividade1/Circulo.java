package aitividade1;

public class Circulo implements Geometrica{

	private double raio;
	
	
	
	
	public Circulo(double raio) {
		this.raio = raio;
	}




	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 3.14*raio;
	}




	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	
}
