package atividade2;

public class Aluno {
	String nome;
	int idade;
	double media;

	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	void calcularMedia(double n1, double n2, double n3) {
		media = ((n1 + n2 + n3) / 3);
		System.out.println("A média do aluno " + nome + ": " + media);
	}

	void verificarAprovado() {
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media < 5) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Em exame!");
		}
	}

}
