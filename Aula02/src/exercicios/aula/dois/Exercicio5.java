package exercicios.aula.dois;

import java.util.Scanner;

public class Exercicio5 {

	static int num1, num2, num3, num4, num5, maior, menor;

	public static void maior(int num1, int num2, int num3, int num4, int num5) {
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
		num1 = input.nextInt();
		System.out.print("Segundo numero: ");
		num2 = input.nextInt();
		System.out.print("Terceiro numero: ");
		num3 = input.nextInt();
		System.out.print("Quarto numero: ");
		num4 = input.nextInt();
		System.out.print("Quinto numero: ");
		num5 = input.nextInt();
		
		maior(num1, num2, num3, num4, num5);
	}

}
