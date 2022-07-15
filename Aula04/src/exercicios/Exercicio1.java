package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int i;
		
		for (i=0; i <= 4; i++) {
			System.out.print("Adicione um numero: ");
			lista.add(i, input.nextInt());
		}
		System.out.println("Array crescente...");
		Collections.sort(lista);
		lista.forEach(x -> {
			System.out.println(x);
		});
		System.out.println();
		System.out.println("Array decrescente...");		
		Collections.reverse(lista);
		lista.forEach(x -> {
			System.out.println(x);
		});

	}

}
