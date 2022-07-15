package estruturas.condicionais;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float numero;
		
		System.out.println("Digite um numero diferente de 0");
		numero = scan.nextFloat();
		
		if (numero > 0) {
			System.out.println("Este é um número positivo!");
		} else if (numero < 0){
			System.out.println("Este é um número negativo!");
		} else {
			System.out.println("Este é um número neutro!");
		}

	}

}
