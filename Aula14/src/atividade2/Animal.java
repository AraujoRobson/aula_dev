package atividade2;

public abstract class Animal {
	
	private String nome, cor, ambiente, caracteristica, alimento;
	private int numPatas = 4;
	private double comprimento, velocidade;
	
	
	//Construtor peixe
	public Animal(String nome,String caracteristica, double comprimento,double velocidade) {
		this.nome = nome;
		this.cor = "Cinzenta";
		this.ambiente = "Mar";
		this.caracteristica = caracteristica;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}
	
	//Construtor Mamifero
	public Animal(String nome, String cor, String alimento, double comprimento,double velocidade, int numPatas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = "Terra";
		this.alimento = alimento;
		this.numPatas = numPatas;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}

	
	
	@Override
	public String toString() {
		return 
				"Nome: " + nome + "\nCor: " + cor + "\nAmbiente: " + ambiente + 
				"\nComprimento: " + comprimento + "\nVelocidade:" + velocidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
	

}
