package atividade2;

public class Docente extends Funcionario {

	private String titulacao;
	private int nivel;
	private double adicional;
	
	
	@Override
	public double calcularSalario() {
		switch (this.getNivel()) {
		case 1,2,3:
			adicional = 0.20;
		case 4,5,6:
			adicional = 0.50;
		case 7,8,9,10:
			adicional = 0.80;
		
		}
		super.setSalario(super.getSalario() + (super.getSalario()*adicional));
		return (super.getSalario());
		
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	

}
