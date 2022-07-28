package exercicios;

public class Veiculo {
	private String modelo,cor;
	private int ano;
	private double km;
	
	public Veiculo(String modelo, int ano, String cor,double km) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.km = km;
	}
	
	public String verificarManutencao() {
		if(this.km < 25000) {
			return "Tudo Ok!";
		}else if(this.km <= 75000) {
			return "Realizar Revisão Parcial";
		}
		return "Realizar Revisão Completa!";
	}
	
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}
	public String getCor() {
		return this.cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
}
