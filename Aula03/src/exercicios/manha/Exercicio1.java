package exercicios.manha;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numero, sucessor;
		
		System.out.print("Entre com um numero: ");
		numero = input.nextInt();
		sucessor = numero +1;
		System.out.println("O sucessor de " + numero + " é " + sucessor);
		
		
	}

}
