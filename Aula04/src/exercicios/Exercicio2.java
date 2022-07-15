package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		ArrayList<Integer> soma = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		int i;

		for (i = 0; i <= 4; i++) {
			System.out.print("LISTA 1. Entre com um numero: ");
			lista1.add(input.nextInt());
		}
		for (i = 0; i <= 4; i++) {
			System.out.print("LISTA 2. Entre com um numero: ");
			lista2.add(input.nextInt());
		}
		for (i = 0; i <= 4; i++) {
			soma.add(lista1.get(i)+lista2.get(i));
		}
		
		soma.forEach(x -> {
			System.out.print(x + " ");
		});

	}

}
