package model;

public class ContaEspecial extends ContaCorrente {
	private double limite;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(double saldo, double limite) {
		super(saldo);
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
