package atividade2;

public class ContaEspecial extends ContaCorrente {
	private float limite;

	public ContaEspecial(String nome, float saldo, float limite) {
		super.setNome(nome);
		super.setSaldo(saldo);
		this.limite = limite;
	}
	
	public boolean sacar(float valor) {
		return false;
	}
	
	
	
	
}
