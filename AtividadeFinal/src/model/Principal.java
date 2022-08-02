package model;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int escolhaItem = 0, qtdDesejada = 0;
		Scanner scan = new Scanner(System.in);
		Pagamento pag = new Pagamento();
		Venda venda = new Venda();
		Produto goiabinha = new Produto("Goiaba", 5.5, 10);
		Produto cafe = new Produto("Cafe", 25.8, 50);
		Produto carne = new Produto("Carne", 55.75, 20);
		Produto alface = new Produto("Alface", 1.99, 14);
		Produto pao = new Produto("Pao", 0.75, 100);
		
		System.out.println("Lista de itens\nQual item deseja adicionar no carrinho?");
		do {
			System.out.println("0 - Para sair!");
			System.out.println("1 - Goiaba\n2 - Cafe\n3 - Carne\n4 - Alface\n5 - Pao");
			escolhaItem = scan.nextInt();
			switch (escolhaItem) {
				case 1:
					System.out.println("Informe a quantidade vendida deste item");
					qtdDesejada = scan.nextInt();
					venda.addItemVenda(goiabinha, qtdDesejada);
					break;
				case 2:
					System.out.println("Informe a quantidade vendida deste item");
					qtdDesejada = scan.nextInt();
					venda.addItemVenda(cafe, qtdDesejada);
					break;
				case 3:
					System.out.println("Informe a quantidade vendida deste item");
					qtdDesejada = scan.nextInt();
					venda.addItemVenda(carne, qtdDesejada);
					break;
				case 4:
					System.out.println("Informe a quantidade vendida deste item");
					qtdDesejada = scan.nextInt();
					venda.addItemVenda(alface, qtdDesejada);
					break;
				case 5:
					System.out.println("Informe a quantidade vendida deste item");
					qtdDesejada = scan.nextInt();
					venda.addItemVenda(pao, qtdDesejada);
					break;
			}
		}while (escolhaItem != 0);
		
		System.out.println(venda.visualizarVenda());
	
		
		System.out.println("Informe a forma de pagamento: ");
		System.out.println("1 - para Dinheiro\n2 - Para Cheque\n3 - Cartão");
		int formaPgmto = scan.nextInt();
		pag.setTipoPagamento(formaPgmto);
		System.out.println(venda.concluirVenda(pag));
	}
}
