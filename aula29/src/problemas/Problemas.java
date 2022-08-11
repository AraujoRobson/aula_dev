package problemas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problemas {
	public static void main(String[] args) {

		try {
			int[] arranjo = { 10, 20, 30 };
			System.out.println("Array:");
			System.out.println(arranjo[0]);
			System.out.println(arranjo[3]);
			// java.lang.ArrayIndexOutOfBoundsException:
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de acesso ao array");
		}

		System.out.println("Programa finalizado!");

		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		System.out.println("\nLista:");
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(3));
		// java.lang.IndexOutOfBoundsException:

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um numero decimal: 'com ponto'");
		double numero = scan.nextDouble();
		// java.util.InputMismatchException
		scan.close();
		numero = Double.parseDouble("10,25");
		// convertendo com virugula
		// java.lang.NumberFormatException

		System.out.println(10 / 0);
		// java.lang.ArithmeticException

		String frase = null;
		System.out.println(frase.toUpperCase());
		// java.lang.NullPointerException
	}
}
