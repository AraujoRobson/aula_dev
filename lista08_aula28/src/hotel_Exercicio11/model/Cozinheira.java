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
	public String toString() {
		return "Cozinha: \n" +
				super.toString() +
				"\n" + cozinhar() +
				"\n" + arrumarCozinha();
	}

	@Override
	public String cozinhar() {
		return "Cozinhar é arte e eu sou o artista!";
	}

	@Override
	public String arrumarCozinha() {
		return "Deixo a cozinha organizada para facilitar minha função.";
	}
}
