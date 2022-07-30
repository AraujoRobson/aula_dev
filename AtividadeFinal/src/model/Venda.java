package model;

import java.util.ArrayList;

public class Venda {
	private double vlrTotal = 0;
	private String itens = "";
	ArrayList<Produto> listaVenda = new ArrayList<>();
	
	public void addItemVenda(Produto produto, int qtdParaVenda) {
		if(produto.verificarEstoque(produto, qtdParaVenda)) {
			listaVenda.add(produto);
			
		}else {
			System.out.println("Estoque insuficiente.");
		}
	}
	public void imprimirTeste() {
		listaVenda.get(0);
	}
	
	public void visualizarVenda() {
		for(int i = 0; i < listaVenda.size(); i++) {
			System.out.println("Item: " + listaVenda.get(i).getNome() + String.format("Valor: R$ %.2f", listaVenda.get(i).getPreco()));
			vlrTotal += listaVenda.get(i).getPreco();
		}
		System.out.println(String.format("%s\n\nValor total: R$%.2f", itens, vlrTotal));
	}
	
	public String concluirVenda(Pagamento pag, int tipoPag) {
		pag.selecionarTipoPagamento(tipoPag);
		return String.format("Valor total: R$%.2f\n%s", vlrTotal, pag.realizarPagamento());
	}
	
	
}
