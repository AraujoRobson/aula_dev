package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

	public Recepcionista() {
		super();

	}

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);

	}

	@Override
	public void atender() {
		System.out.println("RECEBO CLIENTE DO HOTEL...");

	}

	@Override
	public void falarIngles() {
		System.out.println("FALO INGL�S...");

	}

}
