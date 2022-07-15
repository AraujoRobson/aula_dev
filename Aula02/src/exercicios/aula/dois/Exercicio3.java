package exercicios.aula.dois;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = 1, soma = 0, qtd = 0;
		float media;

		while (numero != 0) {
			System.out.print("Entre com um numero: ");
			numero = input.nextInt();
			if (numero > 0) {
				qtd++;
				soma = numero + soma;
			}

		}

		if (qtd > 0) {
			media = (float) (soma / qtd);
		}else {
			media = 0;
		}
		
		System.out.println("Foram digitados: " + qtd + " numeros.");
		System.out.println("E a média deles é: " + media);
	}

}
