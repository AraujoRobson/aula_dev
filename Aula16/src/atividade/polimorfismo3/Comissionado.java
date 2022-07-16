package atividade.polimorfismo3;

public class Comissionado extends Empregado{
	
	private double totalVenda,taxaComissao;

	public Comissionado(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}
	
	

	@Override
	public double vencimento() {
		this.taxaComissao = this.taxaComissao*totalVenda;
		return this.totalVenda + this.taxaComissao;
	}



	public double getTotalVenda() {
		return totalVenda;
	}



	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}



	public double getTaxaComissao() {
		return taxaComissao;
	}



	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}



	@Override
	public String toString() {
		return "Comissionado "+
				super.toString() + 
				"\nTotal de Vendas: R$" + totalVenda + "\nTaxa de Comissao: " + taxaComissao + "%" +
				"\nSalario: R$" + vencimento();
	}

	
}
