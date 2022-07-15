package aitividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int opcao;
		double base, altura;
		
		System.out.println("Qual forma deseja calcular");
		System.out.println("1 - Quadrado\n2 - Ret�ngulo\n3 - C�rculo");
		opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o tamanho do lado: ");
			Quadrado q = new Quadrado(scan.nextDouble());
			System.out.println(q.calcularArea());
		case 2:
			System.out.println("Digite a base");
			base = scan.nextDouble();
			System.out.println("Digite a altura");
			altura = scan.nextDouble();
			
			Retangulo r = new Retangulo(base, altura);
			System.out.println(r.calcularArea());
			
		case 3:
			System.out.println("Digite o tamanho do raio: ");
			Circulo c = new Circulo(scan.nextDouble());
			System.out.println(c.calcularArea());
		}

	}

}
