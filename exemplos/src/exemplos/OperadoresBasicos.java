package exemplos;

import java.util.Scanner;

public class OperadoresBasicos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float num1, num2, soma, sub, mult, div;
		
		
		System.out.print("Digite o primeiro numero: ");
		num1 = scan.nextFloat();
		System.out.print("Digite o segundo numero: ");
		num2 = scan.nextFloat();

		soma = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+sub);
		System.out.println("Multiplicação: "+mult);
		System.out.println("Divisão: "+div);

	}

}
