package atividade1;

public class Gerente extends Empregado {
	private String departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		super.setNome(nome);;
		super.salario = salario;
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return 
				"Nome = " + super.getNome() +
				"\nSal�rio = " + salario +
				"\nDepartamento = " + departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
}
