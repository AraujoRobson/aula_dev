package heranca;

public abstract class Jogo {
	
	private String nome, distribuidora;
	private int numJogadores, faixaEtaria;
	
	public void infoJogo() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Distribuidora: " + this.getDistribuidora());
		System.out.println("Número de Jogadores : " + this.numJogadores);
		System.out.println("Faixa Etária: " + this.faixaEtaria);
		
	}
	
	public void jogar() {
		System.out.println("Você está jogando!");
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public int getNumJogadores() {
		return numJogadores;
	}
	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	
	

}
