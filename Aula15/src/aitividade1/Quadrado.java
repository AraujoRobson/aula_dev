package aitividade1;

public class Quadrado implements Geometrica {

	private double lado;
	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

}
