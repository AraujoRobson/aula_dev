package Exercicio1;

public abstract class Assistente extends Funcionario {
	
	private int matricula;
		

	public Assistente(String nome, double salario,int matricula) {
		super.setNome(nome);
		super.setSalario(salario);
		this.matricula = matricula;
	}
	
	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Matrícula: " + this.getMatricula());
	}



	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
