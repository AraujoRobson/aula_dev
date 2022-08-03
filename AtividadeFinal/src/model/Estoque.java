package model;

import java.util.ArrayList;

public class Estoque {
	ArrayList<Produto> estoque = new ArrayList<>();
	
	public void incluirItem(Produto produto) {
		estoque.add(produto);
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
}
