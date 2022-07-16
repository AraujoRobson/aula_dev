package atividade.polimorfismo3;

public abstract class Empregado {
	
	private String nome, sobrenome, cpf;
	
	public abstract double vencimento();

	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " " + sobrenome + "\nCPF: " + cpf;
	}
	
	

}
