package Exercicio3;

public class Administrador extends Empregado {
	
	private double ajudaCusto;
	

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	@Override
	public double calcSalario() {
		return (getSalarioBase() + this.ajudaCusto - getImposto());
	}

	
	
	@Override
	public String toString() {
		return super.toString() +
				"\nAjuda de Custo: " + ajudaCusto + " (J� incluso no sal�rio)";
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	

}
