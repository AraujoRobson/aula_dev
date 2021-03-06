package atividade1;

public class ContaEspecial extends ContaBancaria {

	private float limite;
	
	public ContaEspecial(String cliente, int numConta, float limite) {
		super(cliente, numConta);
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor < super.getSaldo() || (valor - super.getSaldo()) <= limite) {
			this.saldo = (super.getSaldo() - valor);
		}else {
			System.out.println("Saque acima do limite liberado para sua conta.");
		}
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nLimite: " + limite;
	}
	
	

}
