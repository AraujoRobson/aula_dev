package atividade1;

import java.util.Scanner;

public class Veiculo {
	Scanner input = new Scanner(System.in);

	String modelo, cor;
	int ano;
	float km;

	void verificarManutencao() {
		if (km < 25000) {
			System.out.println("Tudo ok!");
		} else if (km < 75000) {
			System.out.println("Realizar revisão parcial!");
		} else {
			System.out.println("Realizar revisão completa!");
		}
	}

	void mudarCor() {
		System.out.println("Você escolheu mudar a cor do veiculo.");
		System.out.println("Informe a cor desejada: ");
		cor = input.next();

	}

	void exibirCor() {
		System.out.println("Cor: " + cor);
	}
	
	
}
