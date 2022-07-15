package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int codigo;
		Pessoa pessoa = new Pessoa();
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa("Robson", 26, 1.72);
		agenda.armazenaPessoa("Fulano", 260, 2.82);
		agenda.armazenaPessoa("Ciclano", 22, 1.93);
		agenda.armazenaPessoa("Beltrano", 36, 1.52);
		
		agenda.imprimePessoa(1);
		
		int r = agenda.buscaPessoa("Robson");
		if (r != -1) {
		  System.out.println("Código: " + r);
		}else {
			System.out.println("Não encontrado.");
		}
		
		agenda.removePessoa("Fulano");
		
		agenda.imprimeAgenda();
	}

}
