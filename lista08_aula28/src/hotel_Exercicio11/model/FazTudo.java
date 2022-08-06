package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.IFazTudo;

public class FazTudo extends Pessoa implements IFazTudo {

	public FazTudo() {
		super();

	}

	public FazTudo(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);

	}

	@Override
	public void FazTudo() {
		System.out.println("N�O EXISTE NADA QUE EU N�O FA�A! PODE CHAMAR QUE EU VOU SOLUCIONAR");

	}

}
