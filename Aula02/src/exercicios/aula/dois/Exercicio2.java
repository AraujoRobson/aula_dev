package exercicios.aula.dois;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, i;
		
		System.out.print("Informe um numero para saber a tabuada de 1 at� 10: ");
		numero = input.nextInt();
		
		for (i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + i*numero);
		}

	}

}
