package atividade1;

public class IngressoVIP extends Ingresso {
	
	private float valorAdicional;
	

	@Override
	public String toString() {
		return "IngressoVIP R$" + (super.getValor() + valorAdicional);
	}

	
	
	public IngressoVIP() {
		super();
	}


	public IngressoVIP(float valorAdicional) {
		super();
		this.valorAdicional = valorAdicional;
	}


	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	
	
	
}
