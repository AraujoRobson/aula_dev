package Exercicio2;

public class Novo extends Imovel {

	private double valorAdicional;
	
	public Novo(String endereco, double preco, double valorAdicional) {
		super(endereco, preco);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public String toString() {
		return 
				"Imovel novo!"+
				"\nEndereço: " + super.getEndereco() + 
				"\nValor: R$" + (super.getPreco()+getValorAdicional());
	}



	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	
	
	
	

}
