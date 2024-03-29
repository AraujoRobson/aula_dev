package Exercicio3;

public class Operario extends Empregado{
	
	private double valorProducao, comissao;

	public Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() +
				"\nComiss�o: "  + calcComissao() + " (j� incluso no sal�rio)";
	}

	private double calcComissao() {
		if(this.valorProducao >= 15000) {
			this.comissao = (0.3 * this.valorProducao);
		} else if (this.valorProducao >= 7500) {
			this.comissao = (0.15 * this.valorProducao);
		}else if(this.valorProducao >= 2000) {
			this.comissao = (0.075 * this.valorProducao);
		}else {
			this.comissao = 0;
		}
		return this.comissao;
	}

	@Override
	public double calcSalario() {
		return getSalarioBase() + calcComissao() - getImposto();
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
}
