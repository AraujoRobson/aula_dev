package atividade2;

public class Principal {

	public static void main(String[] args) {
		
		Peixe peixe = new Peixe("Dourado", "Barbatana e cauda", 0.75, 5);
		Mamifero mamifero = new Mamifero("Urso", "Marrom", "Mel", 1.75, 2, 4);
		
		
		peixe.alteraCaracteristica("Cauda e barbatana");
		System.out.println(peixe.toString() + "\n--------");
		
		mamifero.alteraAlimento("Mais Mel");
		System.out.println(mamifero.toString()+ "\n--------");
		

	}

}
