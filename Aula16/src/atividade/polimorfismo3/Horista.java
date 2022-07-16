package atividade.polimorfismo3;

public class Horista extends Empregado {
	
	private double precoHora, horasTrab;

	public Horista(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public double vencimento() {
		return this.horasTrab*this.precoHora;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public double getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}

	@Override
	public String toString() {
		return "Horista " + 
				super.toString() + 
				"\nPreço por Hora:" + precoHora + "\nHoras Trabalhadas: " + horasTrab + 
				"\nSalario: R$" + vencimento();
	}

	
	
}
