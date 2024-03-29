package Exercicio3;

public class Empregado extends Pessoa {

	private int codSetor;
	private double salarioBase,imposto;
	
	public Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() +
				"\nC�digo Setor: " + codSetor + 
				"\nSal�rio Base: " + salarioBase +
				"\nSal�rio liquido: " + calcSalario();
	}



	public double calcSalario() {
		return (this.salarioBase - this.imposto);
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	

}
