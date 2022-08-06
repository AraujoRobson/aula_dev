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
		Gerente gerente = new Gerente("TEOBALDO", "4998784212", "548978916");
		gerente.arrumarACama();
		gerente.arrumarCozinha();
		gerente.atender();
		gerente.Cozinhar();
		gerente.falarIngles();
		gerente.limparQuarto();
		System.out.println();

		System.out.println("RECEPCIONISTA");
		System.out.println();
		Recepcionista recepcionista = new Recepcionista("REB�CA", "4987978978", "4868789798789");
		recepcionista.atender();
		recepcionista.falarIngles();
		System.out.println(recepcionista.toString());
		System.out.println();

		System.out.println("CAMAREIRA");
		System.out.println();
		Camareira camareira = new Camareira("LARITNA", "4999889898", "787975678789");
		camareira.arrumarACama();
		System.out.println(camareira.toString());
		System.out.println();

		System.out.println("COZINHEIRA");
		System.out.println();
		Cozinheira cozinheira = new Cozinheira("ROSEVITA", "45648978965", "7954564678");
		cozinheira.Cozinhar();
		cozinheira.arrumarCozinha();
		System.out.println(cozinheira.toString());
		System.out.println();

		System.out.println("FAZ TUDO");
		System.out.println();
		FazTudo faztudo = new FazTudo("BATISTA", "45645649879", "45678978979");
		faztudo.FazTudo();
		System.out.println(faztudo.toString());
		System.out.println();

		System.out.println("AUXILIAR GERAL");
		System.out.println();
		AuxiliarGeral auxiliargeral = new AuxiliarGeral("EUST�QUIO", "45678979787", "42564645646");
		auxiliargeral.AuxiliarGeral();
		System.out.println(auxiliargeral.toString());
		System.out.println();

		System.out.println("CLIENTE");
		System.out.println();
		Cliente cliente = new Cliente("ADRIAN", "49991513025", "10578351960", 32000);
		System.out.println(cliente.toString());
	}

}
