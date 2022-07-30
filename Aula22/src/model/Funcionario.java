package model;

public class Funcionario extends Pessoa {
	private float salario, imposto;
	private String area;
	
	public Funcionario(String nome, float salario) {
		super.setNome(nome);
		this.salario = salario;
		this.imposto = (float) 0.03;
		calcularImposto();
	}
	protected Funcionario(String nome, float salario, String area) {
		super.setNome(nome);
		this.salario = salario;
		this.imposto = (float) 0.05;
		this.area = area;
		calcularImposto();
	}
	
	protected double calcularImposto() {
		return (salario*imposto);
	}
	
	@Override
	public String imprimeDados() {
		return 
				String.format("Nome: %s\nSalario: R$%.2f\nImpostos: R$%.2f", 
						super.getNome(), (calcularImposto() + salario), calcularImposto());
	}
	
	public float getSalario() {
		return this.salario;
	}
	protected String getArea() {
		return this.area;
	}
}
