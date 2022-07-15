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
			System.out.println("1 - Adicionar anota��o.");
			System.out.println("2 - Visualizar caderno de anota��es.");
			System.out.println("3 - Apagar anota��es.");
			System.out.println("4 - Sair");
			System.out.print("Informe a op��o:");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("Digite a anota��o: ");
				teste.adicionarAnotacao(input.next());
				break;
			case 2:
				System.out.println("");
				teste.visualizarAnotacoes();
				break;
			case 3:
				System.out.println("");
				teste.apagarAnotacoes();
				System.out.println("Apagando anota��es.....");
				System.out.println("");
				System.out.println("Apagado!");
				break;
			case 4:
				System.out.println("Saindo....");
				break;
			default:
				System.out.println("Hmmm... n�o estava esperando essa resposta.");
				break;
			}
			
		} while (opcao != 4);

	}

}
