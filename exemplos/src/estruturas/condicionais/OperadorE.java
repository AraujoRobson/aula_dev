package estruturas.condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		String aluno;
		float media, frequencia;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual é o nome do aluno? ");
		aluno = scan.next();
		System.out.print("Qual é a média do aluno? ");
		media = scan.nextFloat();
		System.out.print ("Qual é a frequência do aluno? ");
		frequencia = scan.nextFloat();
		
		if (media >= 7 && frequencia >= 75){
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
		}
		

	}

}
