package exercicios.manha;

import java.util.Scanner;

public class Exercicio3 {

	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cigarroDia, anos, dias;
		float valor, totalGasto;
		System.out.print("Quantos anos vc fuma? ");
		anos = input.nextInt();
		dias = anos*365;
		
		System.out.print("Quantos cigarros vc fuma por dia? ");
		cigarroDia = input.nextInt();
		
		System.out.print("Qual o valor da carteira com 20 cigarros? ");
		valor = input.nextFloat();
		
		totalGasto = (float) (((cigarroDia*dias)/20)*valor);
		
		System.out.println("O valor gasto é R$"+totalGasto+", em "+anos+" ano(s).");
	}

}
