package model;

public class ContaEspecial extends ContaCorrente {
	private Cliente cliente;
	private double limite;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(Cliente cliente , double saldo, double limite) {
		this.cliente = cliente;
		this.saldo = saldo;
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
