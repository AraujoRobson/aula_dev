package atividade3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double valor;
		int escolha, operacao;
		String titular;

		Conta conta1 = new Conta(1, "Maria", "Conta Corrente");
		Conta conta2 = new Conta(2, "João", "Poupança");
		
		System.out.println("Conta 1, titular Maria");
		System.out.println("Conta 2, titular Jo�o");
		System.out.println("Qual conta deseja acessar?");
		escolha = input.nextInt();
		
		if ((escolha != 1) && (escolha != 2)) {
			System.out.println("CONTA INVÁLIDA!!!");
			System.out.println("1 - Conta 1, titular Maria");
			System.out.println("2 - Conta 2, titular João");
			System.out.println("Qual conta deseja acessar?");
			escolha = input.nextInt();
		}
		do {
			if (escolha == 1) {
				titular = conta1.titularConta;
			} else {
				titular = conta2.titularConta;
			}
			System.out.println();
			System.out.println("Conta: " + titular);
			System.out.println("1 - Depositar.");
			System.out.println("2 - Sacar.");
			System.out.println("3 - Verificar Informa��es da conta.");
			System.out.println("4 - Para sair");
			System.out.println("Qual opera��o deseja fazer?");
			operacao = input.nextInt();
			if (escolha == 1) {
				switch (operacao) {
				case 1:
					System.out.println();
					System.out.println("Op��o DEPOSITAR selecionada.");
					System.out.println("Qual valor deseja depositar?");
					valor = input.nextDouble();
					conta1.depositar(valor);
					break;
				case 2:
					System.out.println();
					System.out.println("Op��o SACAR selecionada.");
					System.out.println("Qual valor deseja sacar?");
					valor = input.nextDouble();
					conta1.sacar(valor);
					break;
				case 3:
					System.out.println();
					System.out.println("Informa��es da conta.");
					conta1.verificarSaldo();
					break;
				case 4:
					escolha = 0;
					break;
				default:
					System.out.println();
					System.out.println("OP��O INV�LIDA!");

				}
			} else {
				switch (operacao) {
				case 1:
					System.out.println();
					System.out.println("Op��o DEPOSITAR selecionada.");
					System.out.println("Qual valor deseja depositar?");
					valor = input.nextDouble();
					conta2.depositar(valor);
					break;
				case 2:
					System.out.println();
					System.out.println("Op��o SACAR selecionada.");
					System.out.println("Qual valor deseja sacar?");
					valor = input.nextDouble();
					conta2.sacar(valor);
					break;
				case 3:
					System.out.println();
					System.out.println("Informa��es da conta.");
					conta2.verificarSaldo();
					break;
				case 4:
					escolha = 0;
					break;
				default:
					System.out.println();
					System.out.println("OP��O INV�LIDA!");

				}
			}
			if (escolha == 0) {
				System.out.println("Conta 1, titular Maria");
				System.out.println("Conta 2, titular Jo�o");
				System.out.println("Qual conta deseja acessar?");
				System.out.println("Para sair digite 0");
				escolha = input.nextInt();
			}

		} while (escolha != 0);

		System.out.println("Voc� saiu!");
	}

}
