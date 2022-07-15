package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		System.out.print("Informe o nome: ");
		pessoa1.nome = input.next();
		System.out.print("Informe a idade: ");
		pessoa1.idade = input.nextInt();
		
		System.out.print("Informe o nome: ");
		pessoa2.nome = input.next();
		System.out.print("Informe a idade: ");
		pessoa2.idade = input.nextInt();
		
		pessoa1.exibirInfo();
		pessoa2.exibirInfo();

	}

}
