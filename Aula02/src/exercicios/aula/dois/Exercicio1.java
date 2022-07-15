package exercicios.aula.dois;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int codigo;
		float total, valorCompra;	
		
		System.out.print("Informe o Valor total da compra: ");
		valorCompra = input.nextFloat();
		
		System.out.println("# - # - # - # - # - # - # - #");
		System.out.println("#                           #");
		System.out.println("#   1   -   Cliente.        #");
		System.out.println("#   2   -   Funcionário.    #");
		System.out.println("#   3   -   VIP.            #");
		System.out.println("#                           #");
		System.out.println("# - # - # - # - # - # - # - #");
		System.out.println();
		System.out.print("Informe o código: ");
		codigo = input.nextInt();
		
		total = 0;
		
		switch (codigo) {
		case 1:
			total = valorCompra;
			break;
		case 2:
			total = (float) (valorCompra -(valorCompra*0.10));
			break;
		case 3:
			total = (float) (valorCompra - (valorCompra*0.05));
			break;
		}
		
		System.out.println("O valor total a ser pago é: R$"+total);
		

	}

}
