package atividade3;

public class Principal {

	public static void main(String[] args) {
		

		Produto prod1 = new Produto("Goiabinha", 1, 50);
		Produto prod2 = new Produto("Maçã", 1, 20);
		Produto prod3 = new Produto("Banana", 1, 60);
		Produto prod4 = new Produto("Tangerina", 1, 55);
		Produto prod5 = new Produto("Bergamota", 1, 40);
		
		prod1.aumentarPreco();
		System.out.println();
		prod2.aumentarPreco();
		System.out.println();
		prod3.aumentarPreco();
		System.out.println();
		prod4.aumentarPreco();
		System.out.println();
		prod5.aumentarPreco();
		

	}

}
