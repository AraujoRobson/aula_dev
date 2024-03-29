package atividade2;

public class ContaCorrente extends Cliente {
	private float saldo;

	
	//CONSTRUTOR VAZIO
	public ContaCorrente() {
	}

	//CONSTRUTOR COM PARAMETRO
	public ContaCorrente(String nome, float saldo) {
		super.setNome(nome);
		this.saldo = saldo;
	}
	//GETTERS E SETTERS
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	//M�TODOS
	public void depositar(float valor) {
		if(valor > 0) {
			this.setSaldo(valor);
			System.out.println("R$" + valor + " depositado!");
		}else {
			System.out.println("Valor negativo.");
		}
	}
	public boolean sacar(float valor) {
		if(valor >= this.getSaldo()) {
			return true;
		}
		return false;
	}
	public boolean transferir(ContaCorrente conta) {
		return false;
	}

	@Override
	public String toString() {
		return 
				super.toString() + 
				"\nSaldo conta: " + this.getSaldo();
	}
	
	
	
	
	
}
