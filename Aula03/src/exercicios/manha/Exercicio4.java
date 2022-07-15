package exercicios.manha;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int maior, menor, num1, num2;
		
		System.out.print("Entre com um numero: ");
		num1 = input.nextInt();
		maior = num1;
		menor = num1;
		System.out.print("Entre com um segundo numero: ");
		num2 = input.nextInt();
		if (num1 >= num2) {
			maior = num1;
			menor = num2;
		} else {
			maior = num2;
			menor = num1;
		}
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
	}

}
