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
	public String toString() {
		return "Faz Tudo:\n" +
				super.toString() +
				"\n" + cafe() + "\n" + limpar();
	}

	@Override
	public String cafe() {
		return "Estou indo fazer o café...";
	}

	@Override
	public String limpar() {
		return "Já irei limpar...";
	}
}
