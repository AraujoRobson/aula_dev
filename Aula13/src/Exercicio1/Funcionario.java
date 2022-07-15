package Exercicio1;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public double addAumento(double valor) {
		setSalario(getSalario()+valor);
		return getSalario();
	}
	
	public double ganhoAnual() {
		return (salario*12);
	}
	
	public void exibeDados() {
		System.out.println("Nome: " + nome +
				"\nSal�rio sem adicionais: "+ salario +
				"\nSal�rio anual: " + ganhoAnual());
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
