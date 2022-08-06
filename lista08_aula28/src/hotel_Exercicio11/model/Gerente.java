package hotel_Exercicio11.model;

import hotel_Exercicio11.interfaces.ICamareira;
import hotel_Exercicio11.interfaces.ICozinheira;
import hotel_Exercicio11.interfaces.IFazTudo;
import hotel_Exercicio11.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira, ICozinheira, IFazTudo {
	public Gerente() {
		super();
	}

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public String toString() {
		return "Gerencia: \n" +
				super.toString() +
				"\n" + atender() +
				"\n" + falarIngles() +
				"\n" + arrumarACama() +
				"\n" + limparQuarto() +
				"\n" + cozinhar() +
				"\n" + arrumarACama() +
				"\n" + cafe() +
				"\n" + limpar() + "\nQuando preciso estou sempre a disposição!";
	}

	@Override
	public String atender() {
		return "Meu atendimento ao hospede não é igual do(a) recepcionista mas cubro quando preciso...";
	}

	@Override
	public String falarIngles() {
		return "Falo Inglês fluentemente.";
	}

	@Override
	public String arrumarACama() {
		return "Deixo a desejar na função de arrumar a cama.";
	}

	@Override
	public String limparQuarto() {
		return "Limpo quartos mais ou menos.";
	}

	@Override
	public String cozinhar() {
		return "Cozinho também quando preciso.";
	}

	@Override
	public String arrumarCozinha() {
		return "Tento deixar organizado, porem, do meu jeito rsrs!";
	}

	@Override
	public String cafe() {
		return "Meu café até que é bom.";
	}

	@Override
	public String limpar() {
		return "Limpar é tranquilo?! né?.";
	}
}
