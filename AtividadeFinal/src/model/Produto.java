package model;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	public boolean verificarEstoque(Produto produto, int qtdParaVenda) {
		if(produto.qtdEstoque >= qtdParaVenda) {
			return true;
		}
		return false;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public String getNome() {
		return this.getNome();
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
