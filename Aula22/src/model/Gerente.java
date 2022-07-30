package model;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, float salario, String area) {
		super(nome, salario, area);
	}
	@Override
	public String imprimeDados() {
		return 
				String.format("Nome: %s\nSalario: R$%.2f\nImpostos: R$%.2f\nGerente: %s", 
						super.getNome(), (calcularImposto() + super.getSalario()), calcularImposto(), super.getArea());
	}
	
	
}
