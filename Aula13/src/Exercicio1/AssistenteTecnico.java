package Exercicio1;

public class AssistenteTecnico extends Assistente {
	
	private double bonusSalarial;
	
	
	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Bonus salarial: " + getBonusSalarial());
		System.out.println("Sal�rio + adicionais: " + addAumento(getBonusSalarial()));
	}

	
	
	public AssistenteTecnico(String nome, double salario, int matricula, double bonusSalarial) {
		super(nome, salario, matricula);
		this.bonusSalarial = bonusSalarial;
	}



	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

	
}
