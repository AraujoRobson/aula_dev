package atividade1;

public class Ingresso {
	private float valor;
	
	
	public Ingresso() {
		super();
	}

	
	public Ingresso(float valor) {
		super();
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Ingresso R$" + valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
