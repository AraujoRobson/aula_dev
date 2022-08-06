package hotel_Exercicio11;

import hotel_Exercicio11.model.AuxiliarGeral;
import hotel_Exercicio11.model.Camareira;
import hotel_Exercicio11.model.Cliente;
import hotel_Exercicio11.model.Cozinheira;
import hotel_Exercicio11.model.FazTudo;
import hotel_Exercicio11.model.Gerente;
import hotel_Exercicio11.model.Recepcionista;

public class Principal {

	public static void main(String[] args) {

		System.out.println("GERENTE");
		System.out.println();
		Gerente gerente = new Gerente("JÉSSICA", "49 99997070", "357.271.390-07");
		gerente.arrumarACama();
		gerente.arrumarCozinha();
		gerente.atender();
		gerente.Cozinhar();
		gerente.falarIngles();
		gerente.limparQuarto();
		System.out.println();

		System.out.println("RECEPCIONISTA");
		System.out.println();
		Recepcionista recepcionista = new Recepcionista("PEDRO", "49 99997070", "911.803.770-44");
		recepcionista.atender();
		recepcionista.falarIngles();
		System.out.println(recepcionista.toString());
		System.out.println();

		System.out.println("CAMAREIRA");
		System.out.println();
		Camareira camareira = new Camareira("LARITNA", "49 99997070", "308.066.740-91");
		camareira.arrumarACama();
		System.out.println(camareira.toString());
		System.out.println();

		System.out.println("COZINHEIRA");
		System.out.println();
		Cozinheira cozinheira = new Cozinheira("ROSEVITA", "49 99997070", "178.271.890-75");
		cozinheira.Cozinhar();
		cozinheira.arrumarCozinha();
		System.out.println(cozinheira.toString());
		System.out.println();

		System.out.println("FAZ TUDO");
		System.out.println();
		FazTudo faztudo = new FazTudo("BATISTA", "49 99997070", "689.640.200-81");
		faztudo.cafe();
		System.out.println(faztudo.toString());
		System.out.println();

		System.out.println("CLIENTE");
		System.out.println();
		Cliente cliente = new Cliente("ADRIAN", "49 99997070", "689.640.200-81", 32000);
		System.out.println(cliente.toString());
	}
}
