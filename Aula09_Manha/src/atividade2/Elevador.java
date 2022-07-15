package atividade2;

public class Elevador {
	private int andarAtual, totalAndares, capacidade, pessoas;
	
	
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getPessoas() {
		return pessoas;
	}

	void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.pessoas = 0;
	}
	
	void entra() {
		if(this.capacidade > this.pessoas) {
			this.pessoas++;
			System.out.println("Entrou uma pessoa...");
		}else {
			System.out.println("Elevador lotado...");
		}
	}
	
	void sai() {
		if (this.pessoas > 0) {
			this.pessoas--;
			System.out.println("Saiu uma pessoa...");
		}else {
			System.out.println("Elevador vazio...");
		}
	}
	
	void sobe() {
		if(this.andarAtual < this.totalAndares) {
			this.andarAtual++;
			System.out.println("Elevador subiu. Atualmente esta no andar: " + this.andarAtual);
		}else {
			System.out.println("Elevador já esta no ultimo andar!");
		}
	}
	
	void desce() {
		if(this.andarAtual != 0) {
			this.andarAtual--;
			System.out.println("Elevador desceu. Atualmente esta no andar: " + this.andarAtual);
		}else {
			System.out.println("Elevador já esta no terreo!");
		}
	}
	
}

