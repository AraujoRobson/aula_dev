package atividade1;

public class ContaBancaria {
	private String cliente;
	private int numConta;
	protected double saldo;
	
	//CONSTRUTOR
	public ContaBancaria(String cliente, int numConta) {
		this.cliente = cliente;
		this.numConta = numConta;
	}
	
	//M�TODOS
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor negativo ou inv�lido!");
		}else {
			saldo += valor;
		}
	}
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	//TO STRING
	@Override
	public String toString() {
		return 
				"Cliente: " + cliente + 
				"\nNumero da conta: " + numConta + 
				"\nSaldo: " + saldo;
	}
	
	//GETTERS E SETTERS
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
