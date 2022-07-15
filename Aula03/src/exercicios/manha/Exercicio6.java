package exercicios.manha;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Entre com sua idade: ");
		idade = input.nextInt();
		
		if (idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue!");
		} else {
			System.out.println("Você não pode doar sangue!");
		}
	}

}
