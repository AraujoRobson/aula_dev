package model;

public class ContaCorrente {
	private Cliente cliente;
	protected double saldo;
	
	public ContaCorrente(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public boolean verificaSaque(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			return true;
		}		
		return false;
	}
	
	public double depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return this.saldo;
		}
		return this.saldo;
	}
	
	public double sacar(double valor) {
		if(verificaSaque(valor)) {
			this.saldo -= valor;	
			return this.saldo;
		}
		return this.saldo;
	}
}
