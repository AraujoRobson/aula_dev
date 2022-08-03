package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	ArrayList<Produto> estoque = new ArrayList<>();
	
	public void incluirItem(Produto produto) {
		estoque.add(produto);
	}
	public int qtdEstoque(int index) {
		return estoque.get(index).getQtdEstoque();
	}
	public boolean verificarEstoque(Produto produto, int qtdParaVenda) {
		if(produto.getQtdEstoque() >= qtdParaVenda) {
			return true;
		}
		return false;
	}
	public Produto produto(int index) {
		return estoque.get(index);
	}
	
	public String visualizarEstoque() {
		String listaItens = "";
		for(int i = 0; i < estoque.size(); i++) {
			listaItens = String.format("%s\nCod:%d	 | %s	| Qtd: %d	| R$%.2f", listaItens, (i + 1),estoque.get(i).getNome(), estoque.get(i).getQtdEstoque(), estoque.get(i).getPreco());
		}
		return String.format(listaItens);
	}
	
	public String[] nomes() {
        String[] lista = new String[estoque.size()];
        for(int i = 0; i < estoque.size(); i++) {
            lista[i] = estoque.get(i).getNome();
        }
        return lista;
    }
	public void apagar() {
		estoque.clear();
	}
}
