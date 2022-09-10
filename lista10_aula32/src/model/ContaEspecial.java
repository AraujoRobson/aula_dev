package model;

public class ContaEspecial extends ContaCorrente {
	private double limite;
	
	public ContaEspecial(Cliente cliente , double saldo, double limite) {
		super(cliente, saldo);
		this.limite = limite;
	}
	
	@Override
	public double sacar(double valor) {
		if(verificaSaque(valor)) {
			this.saldo -= valor;
			return this.saldo;
		}
		return this.saldo;
	}
	
	@Override
	public boolean verificaSaque(double valor) {
		if(valor > 0 && (saldo + limite) >= valor) {
			return true;
		}
		return false;
	}
}
