package exercicios.manha;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float km, litros,media;
		
		System.out.print("Quantos kms percorridos? ");
		km = input.nextFloat();
		System.out.print("Quantos litros gasto? ");
		litros = input.nextFloat();
		
		media = (float) (km/litros);
		
		System.out.println("A média de consumo é: " + media);
		
	}

}
