package Exercicio1;

public class AssistenciaAdm extends Assistente{

	private double adicionalNoturno;
	
	public AssistenciaAdm(String nome, double salario, int matricula, double adicionalNoturno) {
		super(nome, salario, matricula);
		this.adicionalNoturno = adicionalNoturno;
	}
	
	@Override
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Adicional noturno: " + getAdicionalNoturno());
		System.out.println("Salário + adicionais: "+ addAumento(getAdicionalNoturno()));
	}
	

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	
	
	

}
