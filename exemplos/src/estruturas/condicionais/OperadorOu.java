package estruturas.condicionais;

import java.util.Scanner;

public class OperadorOu {

	public static void main(String[] args) {
		
		String aluno,curso;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual � o nome do aluno? ");
		aluno = scan.next();
		System.out.print("Qual � o curso que o aluno est� cursando? ");
		curso = scan.next();
		
		if((curso.equals("Eng. de Produ��o")) || (curso.equals("Eng. El�trica"))) {
			System.out.println("O aluno " + aluno + " est� aprovado.");
		} else {
			System.out.println("O aluno " + aluno + " est� reprovado.");
		}

	}

}
