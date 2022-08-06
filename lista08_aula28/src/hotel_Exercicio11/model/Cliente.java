package hotel_Exercicio11.model;

public class Cliente extends Pessoa {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cliente \n" + super.toString() + "\nsalario:" + salario;
	}

	public Cliente(String nome, String telefone, String cpf, double salario) {
		super(nome, telefone, cpf);
		this.salario = salario;
	}

}
