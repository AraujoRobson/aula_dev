package exercicios.aula.um;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String genero;

		System.out.print("Informe seu gênero com F ou M: ");
		genero = scan.next();
		
		if (genero.equals("F")) {
			System.out.println("FEMININO!");			
		} else if (genero.equals("M")){
			System.out.println("MASCULINO!");
		} else {
			System.out.println("Opção invalida.");
		}
		

	}

}
