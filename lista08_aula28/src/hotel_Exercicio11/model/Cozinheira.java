package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.ICozinheira;

public class Cozinheira extends Pessoa implements ICozinheira {

	public Cozinheira() {
		super();

	}

	public Cozinheira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);

	}

	@Override
	public void Cozinhar() {
		System.out.println("COZINHO COM MAESTRIA!");

	}

	@Override
	public void arrumarCozinha() {
		System.out.println("Arrumo a cozinha e deixo ela brilhando!");

	}

}
