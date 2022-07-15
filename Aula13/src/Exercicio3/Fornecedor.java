package Exercicio3;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}
	
	public double obterSaldo() {
		if (this.valorDivida > this.valorCredito) {
			return (this.valorDivida - this.valorCredito);
		}else {
			return(this.valorCredito - this.valorDivida);
		}
	}
	
	

	@Override
	public String toString() {
		return super.toString() +
				"\nValor Cr�dito: " + this.valorCredito +
				"\nValor D�vida: " + this.valorDivida +
				"\nValor de Diferen�a: "+ obterSaldo();
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	

}
