package model;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
}
