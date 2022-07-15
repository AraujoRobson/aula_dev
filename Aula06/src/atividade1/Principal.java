package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double num1, num2;
		Scanner input = new Scanner(System.in);
		
		Calculadora resposta = new Calculadora();
		
		System.out.print("Informe o primeiro numero: ");
		num1 = input.nextDouble();
		System.out.print("Informe o segundo numero: ");
		num2 = input.nextDouble();
		
		resposta.somar(num1, num2);
		resposta.subtrair(num1, num2);
		resposta.multiplicar(num1, num2);
		resposta.dividir(num1, num2);
		
	
		

	}

}
