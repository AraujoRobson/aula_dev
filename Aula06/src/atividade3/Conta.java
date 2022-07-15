package atividade3;

public class Conta {

	int numeroConta;
	String titularConta, tipoConta;
	private double saldo;
	
	public Conta(int numeroConta, String titularConta, String tipoConta) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.tipoConta = tipoConta;
	}

	void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Novo saldo: R$" + saldo);
	}

	void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Valor de saque maior que saldo!");
		} else {
			saldo = saldo - valor;
		}
		System.out.println("Novo saldo: R$" + saldo);

	}

	void verificarSaldo() {

		/*
		 * Este método deve exibir na tela os dados da conta, como número, tipo da
		 * conta, titular da conta e o saldo atual.
		 */

		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Tipo da conta: " + tipoConta);
		System.out.println("Titular da conta: " + titularConta);
		System.out.println("Seu saldo é: R$" + saldo);

	}

}
