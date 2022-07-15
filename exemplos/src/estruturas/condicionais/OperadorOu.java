package estruturas.condicionais;

import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		
		String aluno,curso;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual é o nome do aluno? ");
		aluno = scan.next();
		System.out.print("Qual é o curso que o aluno está cursando? ");
		curso = scan.next();
		
		if((curso.equals("Eng. de Produção")) || (curso.equals("Eng. Elétrica"))) {
			System.out.println("O aluno " + aluno + " está aprovado.");
		} else {
			System.out.println("O aluno " + aluno + " está reprovado.");
		}

	}

}
