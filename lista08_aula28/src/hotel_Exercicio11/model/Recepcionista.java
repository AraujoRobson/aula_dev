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
	public String atender() {
		return "A função é recepcionar os hospedes.";
	}

	@Override
	public String falarIngles() {
		return "Nivel de inglês: Fluente";
	}

}
