package exercicios;

import javax.swing.JOptionPane;

public class Conta {
	private int numeroConta;
	private String tipoConta, titularConta;
	private double saldo = 0;
	
	public Conta(int numConta, String titular, String tipoConta) {
		super();
		this.numeroConta = numConta;
		this.titularConta = titular;
		this.tipoConta = tipoConta;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		JOptionPane.showMessageDialog(null, String.format("R$%.2f depositado com sucesso!", valor));
	}
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			saldo -= valor;
			JOptionPane.showMessageDialog(null, String.format("R$%.2f sacado com sucesso!", valor));
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
	}
	public String verificarSaldo() {
		return
				String.format("<html>Titular:  %s<br>Numero da conta:  %d<br>Tipo da conta:  %s<br>Saldo:  R$%.2f", this.titularConta, this.numeroConta,this.tipoConta, this.saldo);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
}
