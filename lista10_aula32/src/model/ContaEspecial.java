package model;

public class ContaEspecial extends ContaCorrente {
	private double limite;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}else if((saldo + limite) >= valor) {
			saldo -= valor;
		}
	}
}
