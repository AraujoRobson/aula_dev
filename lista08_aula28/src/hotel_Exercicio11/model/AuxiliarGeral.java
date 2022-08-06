package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.IAuxiliarGeral;

public class AuxiliarGeral extends Pessoa implements IAuxiliarGeral {

	@Override
	public void AuxiliarGeral() {
		System.out.println("QUEM FAZ TUDO PODE AT� SE ACHAR, MAS SEM MIM, ELES N�O CONSEGUEM.");

	}

	public AuxiliarGeral() {
		super();

	}

	public AuxiliarGeral(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);

	}

}
