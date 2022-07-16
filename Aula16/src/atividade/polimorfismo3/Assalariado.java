package atividade.polimorfismo3;

public class Assalariado extends Empregado {
	
	private double salario;
	
	public Assalariado(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public double vencimento() {
		return this.salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Assalariado: "+
				super.toString() + 
				"\nSalario: R$" + vencimento();
	}
	
	

	

}
