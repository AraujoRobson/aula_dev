package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Veiculo veiculo1 = new Veiculo();
		
		System.out.print("Infome o modelo: ");
		veiculo1.modelo = input.next();
		System.out.print("Informe o ano: ");
		veiculo1.ano = input.nextInt();
		System.out.print("Informe a cor: ");
		veiculo1.cor = input.next();
		System.out.print("Informe a KM: ");
		veiculo1.km = input.nextFloat();
		
		veiculo1.verificarManutencao();
		veiculo1.exibirCor();
		veiculo1.mudarCor();
		veiculo1.exibirCor();
	}

}
