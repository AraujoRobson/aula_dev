package exercicios.manha;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Informe seu nome: ");
		nome = input.next();
		System.out.print("Agora informe sua idade: ");
		idade = input.nextInt();
		
		if (idade < 16) {
			System.out.println(nome+", voc� n�o pode votar.");
		} else {
			System.out.println(nome+", voc� � apto a votar.");
		}

	}

}
