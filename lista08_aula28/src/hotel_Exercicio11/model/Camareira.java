package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

	public Camareira() {
		super();
	}

	public Camareira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public String arrumarACama() {
		return "Lençol arrumado.";
	}

	@Override
	public String limparQuarto() {
		return "Quartos brilhando e cheirosos.";
	}
}
