package model;

public class ContaCorrente {
	private Cliente cliente;
	protected double saldo;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(Cliente cliente, double saldo) {
		this.cliente = cliente;
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
