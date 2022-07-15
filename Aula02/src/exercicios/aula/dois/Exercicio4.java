package exercicios.aula.dois;

import java.util.Scanner;

public class Exercicio4 {
	static float raio, resposta;

	public static float volume(float r) {
		float aux;
		aux = (float) (1.333333 * (3.14) * (r * r * r));
		return aux;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Entre com o valor do raio de uma esfera: ");
		raio = input.nextFloat();
		
		resposta = volume(raio);
		System.out.println("O volume da esfera é: " + resposta);

	}

}
