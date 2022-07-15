package atividade1;

public class Principal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Robson", 5000, "Vendas");
		Vendedor vendedor = new Vendedor("Fulano", 1500, 10);
		
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());

	}

}
