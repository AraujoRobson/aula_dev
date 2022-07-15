package exercicios.aula.um;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		float custoFabrica, valorFinal, distribuidor, imposto;
		
		System.out.print("Informe o custo de fábrica: ");
		custoFabrica = scan.nextFloat();
		
		distribuidor = (float)(custoFabrica*0.28);
		imposto = (float) (custoFabrica*0.45);
		
		valorFinal = distribuidor+imposto+custoFabrica;
		
		System.out.println("O valor final é: R$"+valorFinal);

	}

}
