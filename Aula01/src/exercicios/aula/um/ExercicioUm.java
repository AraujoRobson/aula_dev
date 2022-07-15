package exercicios.aula.um;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float valorHora, horasTrabalhadas, soma;
		
		
		System.out.print("Qual é o valor da hora? ");
		valorHora = scan.nextFloat();
		System.out.print("Quantas horas foi trabalhada? ");
		horasTrabalhadas = scan.nextFloat();
		
		soma = (valorHora*horasTrabalhadas);
		
		System.out.println("O salário é: R$"+soma);
		
	}

}
