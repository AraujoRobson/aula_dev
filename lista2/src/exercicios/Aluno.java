package exercicios;

public class Aluno {
	private String nome;
	private int idade;
	private double media = 0;
	
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String calcularMedia(double n1, double n2, double n3) {
		media = (n1 + n2 + n3)/3;
		return String.format("Média final: %.2f", media);
	}
	public String verificarAprovacao() {
		if(media >= 7) {
			return "APROVADO!";
		}else if(media >= 5) {
			return "EM EXAME!";
		}
		return "REPROVADO!";
	}
}
