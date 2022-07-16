package atividade.polimorfismo1;

import java.util.ArrayList;

public class Loja {

	public static void main(String[] args) {
		
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		estoque.add(new Livros("A volta dos que não foram", 72.4, "Sandoval"));
		estoque.add(new Livros("Jagunço e seus pets", 36.76, "Sandoval"));
		estoque.add(new CDs("Mais do mesmo", 135, 16));
		estoque.add(new CDs("Imunidade Musical", 142, 22));
		estoque.add(new DVDs("As tranças de um careca", 55.80, 120));
		
		
		estoque.forEach(x -> {
			System.out.println(x);
		});

	}

}
