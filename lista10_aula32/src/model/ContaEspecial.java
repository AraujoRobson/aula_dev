package model;

public class ContaEspecial extends ContaCorrente {
	private double limite;
	
	public ContaEspecial(Cliente cliente , double saldo, double limite) {
		super(cliente, saldo);
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(verificaSaque(valor)) {
			saldo -= valor;
		}else {
			super.erroSaque();
		}
	}
	
	@Override
	public boolean verificaSaque(double valor) {
		if((saldo + limite) >= valor) {
			return true;
		}
		return false;
	}
}
