package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int i, maior, menor;
		
		for(i=0; i<=9; i++) {
			System.out.print("Entre com um numero: ");
			numeros.add(input.nextInt());
		}
		maior = Collections.max(numeros);
		menor = Collections.min(numeros);
		System.out.println("Os numeros digitados foram: ");
		numeros.forEach(x -> {
			System.out.print(x + " ");
		});
		System.out.println();
		System.out.println("O maior é: " + maior);
		System.out.println("O menor é: " + menor);
		

	}

}
