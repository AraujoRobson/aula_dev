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
		Gerente gerente = new Gerente("JÉSSICA", "49 99997070", "548978916");
		gerente.arrumarACama();
		gerente.arrumarCozinha();
		gerente.atender();
		gerente.Cozinhar();
		gerente.falarIngles();
		gerente.limparQuarto();
		System.out.println();

		System.out.println("RECEPCIONISTA");
		System.out.println();
		Recepcionista recepcionista = new Recepcionista("PEDRO", "49 99997070", "4868789798789");
		recepcionista.atender();
		recepcionista.falarIngles();
		System.out.println(recepcionista.toString());
		System.out.println();

		System.out.println("CAMAREIRA");
		System.out.println();
		Camareira camareira = new Camareira("LARITNA", "49 99997070", "787975678789");
		camareira.arrumarACama();
		System.out.println(camareira.toString());
		System.out.println();

		System.out.println("COZINHEIRA");
		System.out.println();
		Cozinheira cozinheira = new Cozinheira("ROSEVITA", "49 99997070", "7954564678");
		cozinheira.Cozinhar();
		cozinheira.arrumarCozinha();
		System.out.println(cozinheira.toString());
		System.out.println();

		System.out.println("FAZ TUDO");
		System.out.println();
		FazTudo faztudo = new FazTudo("BATISTA", "49 99997070", "45678978979");
		faztudo.cafe();
		System.out.println(faztudo.toString());
		System.out.println();

		System.out.println("CLIENTE");
		System.out.println();
		Cliente cliente = new Cliente("ADRIAN", "49 99997070", "10578351960", 32000);
		System.out.println(cliente.toString());
	}
}
