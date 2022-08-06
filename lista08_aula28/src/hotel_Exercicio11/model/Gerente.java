package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.ICamareira;
import hotel_Exercicio11.interfaces.ICozinheira;
import hotel_Exercicio11.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira, ICozinheira {

	public Gerente() {
		super();

	}

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);

	}

	@Override
	public String toString() {
		return super.toString() + "Gerente []";
	}

	@Override
	public void atender() {
		System.out.println("Atendo os clientes mais ou menos...");

	}

	@Override
	public void falarIngles() {
		System.out.println("Falo Ingl�s com maestria");

	}

	@Override
	public void arrumarACama() {
		System.out.println("ARRUMO A CAMA mais ou menos");

	}

	@Override
	public void limparQuarto() {
		System.out.println("Limpo quartos tamb�m");

	}

	@Override
	public void Cozinhar() {
		System.out.println("Cozinho tamb�m!");

	}

	@Override
	public void arrumarCozinha() {
		System.out.println("Quem cozinha tamb�m limpa, n�?");

	}

}
