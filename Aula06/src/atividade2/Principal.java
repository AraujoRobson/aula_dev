package atividade2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		String nome;
		int idade;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		nome = input.next();
		System.out.print("Informe a idade: ");
		idade = input.nextInt();
		
		Aluno aluno = new Aluno(nome, idade);

		System.out.print("Informe a nota 1:");
		n1 = input.nextDouble();
		System.out.print("Informe a nota 2:");
		n2 = input.nextDouble();
		System.out.print("Informe a nota 3:");
		n3 = input.nextDouble();
		
		aluno.calcularMedia(n1, n2, n3);
		aluno.verificarAprovado();
		
	}

}
