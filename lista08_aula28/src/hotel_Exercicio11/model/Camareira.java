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
	public void arrumarACama() {
		System.out.println("ARRUMO A CAMA COM MAESTRIA");

	}

	@Override
	public void limparQuarto() {
		System.out.println("LIMPO quartos com maestria");

	}

}
