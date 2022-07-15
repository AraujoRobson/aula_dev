package atividade2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CadernoAnotacoes teste = new CadernoAnotacoes();
		int opcao;
		
		
		do {
			System.out.println("");
			System.out.println("MENU");
			System.out.println("1 - Adicionar anotação.");
			System.out.println("2 - Visualizar caderno de anotações.");
			System.out.println("3 - Apagar anotações.");
			System.out.println("4 - Sair");
			System.out.print("Informe a opção:");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("Digite a anotação: ");
				teste.adicionarAnotacao(input.next());
				break;
			case 2:
				System.out.println("");
				teste.visualizarAnotacoes();
				break;
			case 3:
				System.out.println("");
				teste.apagarAnotacoes();
				System.out.println("Apagando anotações.....");
				System.out.println("");
				System.out.println("Apagado!");
				break;
			case 4:
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("Hmmm... não estava esperando essa resposta.");
				break;
			}
			
		} while (opcao != 4);

	}

}
