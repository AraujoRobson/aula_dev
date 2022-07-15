package estrutura.repeticao;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {

		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escolha um numero de 1 a 4: ");
		num = input.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Você escolheu 1");
				break;
			case 2:
				System.out.println("Você escolheu 2");
				break;
			case 3:
				System.out.println("Você escolheu 3");
				break;
			case 4:
				System.out.println("Você escolheu 4");
				break;
			default:
				System.out.println("Numero inválido");
			
		}
		
	}

}
