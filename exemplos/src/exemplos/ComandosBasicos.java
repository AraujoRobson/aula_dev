package exemplos;

import java.util.Scanner;

public class ComandosBasicos {

	public static void main(String[] args) {
		/*para comentar mais
		 * de uma linha vc usa isso*/
		
		Scanner scan = new Scanner(System.in);
		
		int num1,num2,soma;
		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		soma = num1 + num2;
		
		//codigo para mostrar algo no console
		// sysout ctrl+space compleca com o código
		System.out.println("a soma é: "+soma);
		
		
		
	}

}
