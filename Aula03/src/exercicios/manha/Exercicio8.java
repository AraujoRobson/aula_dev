package exercicios.manha;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int base,expo,i,resultado=0;
		
		System.out.print("Entre com a base: ");
		base = input.nextInt();
		System.out.print("Entre com o expoente: ");
		expo = input.nextInt();

		for (i = 1; i <= expo; i++) {
			resultado = base*base;
		}
		System.out.println("Base: "+base+" expoente: "+expo+" = "+resultado);
	}

}
