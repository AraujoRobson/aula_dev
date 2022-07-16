package atividade.polimorfismo2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Empresa> empresa = new ArrayList<>();
		
		empresa.add(new SemEscolaridade("Joãozinho", 376));
		empresa.add(new Escola("Maria", 325, "EEB São Miguel", "Básico"));
		empresa.add(new Escola("Fernando", 631, "BRICIO FILHO", "Médio"));
		empresa.add(new Universidade("Robson", 406104, "UNOESC SMO"));

		empresa.forEach(x -> {
			System.out.println();
			System.out.println(x);
		});
		
	}

}
