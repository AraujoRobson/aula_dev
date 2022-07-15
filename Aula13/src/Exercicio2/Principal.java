package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int escolha;
		
		Scanner scan = new Scanner(System.in);
		
		Imovel imovel;
		
		
		System.out.println("Menu:"+
							"\nInforme 1 para NOVO"+
							"\nInforme 2 para USADO");
		escolha = scan.nextInt();
		
		switch(escolha) {
		case 1:
			imovel = new Novo("Rua Goiabinha", 200000,25000);
			System.out.println(imovel.toString());
			break;
		case 2:
			imovel = new Velho("Rua Goiabinha", 200000,20000);
			System.out.println(imovel.toString());
			break;
		default:
			System.out.println("Opção inválida...");
		}
		
		

	}

}
