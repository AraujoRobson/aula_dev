package Exercicio3;

public class Vendedor extends Empregado {
	
	private double valorVendas, comissao;

	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}
	
	private double calcComissao() {
		if(this.valorVendas >= 10000) {
			this.comissao = (0.3 * this.valorVendas);
		} else if (this.valorVendas >= 5000) {
			this.comissao = (0.15 * this.valorVendas);
		}else if(this.valorVendas >= 1500) {
			this.comissao = (0.075 * this.valorVendas);
		}else {
			this.comissao = 0;
		}
		return this.comissao;
	}
	
	

	@Override
	public String toString() {
		return super.toString() +
				"\nComissao: " + comissao + " (j� incluso no sal�rio)";
	}

	@Override
	public double calcSalario() {
		return (getSalarioBase() + calcComissao() - getImposto());
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
	

}
