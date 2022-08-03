package model;

import java.util.ArrayList;

public class Produto {
	private String nome, itensEstoque = "", listaEstoque = "";
	private double preco;
	private int qtdEstoque;

	ArrayList<Produto> estoque = new ArrayList<>();
	
	public Produto(String nome, double preco, int qtdEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	public Produto() {
		super();
	}
	public boolean verificarEstoque(Produto produto, int qtdParaVenda) {
		if(produto.qtdEstoque >= qtdParaVenda) {
			return true;
		}
		return false;
	}
	
	public void incluirEstoque(Produto produto) {
		estoque.add(produto);
	}
	
	//public String listaEstoque() {
	//	return estoque;
	//}
	
	public String visualizarEstoque() {
		itensEstoque = "";
		for(int i = 0; i < estoque.size(); i++) {
			itensEstoque = String.format("%s\nCod:%d	 | %s	| Qtd: %d	| R$%.2f", itensEstoque, (i + 1),estoque.get(i).getNome(), estoque.get(i).getQtdEstoque(), estoque.get(i).getPreco());
		}
		return String.format(itensEstoque);
	}
	public double getPreco() {
		return preco;
	}
	public String getNome() {
		return nome;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setQtdEstoque(int qtd) {
		this.qtdEstoque = qtd;
	}
}
