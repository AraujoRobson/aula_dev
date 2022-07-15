package Exercicio2;

public class Velho extends Imovel {
	
	private double valorDesconto;

	public Velho(String endereco, double preco, double desconto) {
		super(endereco, preco);
		this.valorDesconto = desconto;
	}
	
	

	@Override
	public String toString() {
		return 
				"Imovel Usado!"+
				"\nEndereço: " + super.getEndereco() + 
				"\nValor: R$" + (super.getPreco()-getValorDesconto());
	}



	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	

}
