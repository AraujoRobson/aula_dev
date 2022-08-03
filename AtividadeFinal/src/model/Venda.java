package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Venda{
	private double vlrTotal = 0;
	Estoque estoque = new Estoque();
	
	ArrayList<Produto> listaVenda = new ArrayList<>();
	
	public void addItemVenda(Produto produto, int qtdParaVenda) {	
		if(produto.verificarEstoque(produto, qtdParaVenda)) {
			for(int i = 0; i < qtdParaVenda; i++) {
				listaVenda.add(produto);
			}
			produto.setQtdEstoque((produto.getQtdEstoque() - qtdParaVenda));
		}else {
			JOptionPane.showMessageDialog(null, "Estoque insuficiente!");
		}
	}
	public String visualizarVenda() {
		String itens = "";
		vlrTotal = 0;
		for(int i = 0; i < listaVenda.size(); i++) {
			itens = String.format("%s\n%s		R$%.2f", itens, listaVenda.get(i).getNome(), listaVenda.get(i).getPreco());
			vlrTotal += listaVenda.get(i).getPreco();
		}
		return String.format("\n%s\nValor total: R$%.2f", itens , vlrTotal);
	}
	public double valorVenda() {
		return vlrTotal;
	}
	public String concluirVenda(Pagamento pag) {
		return String.format("Valor total: R$%.2f\n%s", vlrTotal, pag.realizarPagamento());
	}
}
