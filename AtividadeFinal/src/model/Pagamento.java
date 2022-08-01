package model;

public class Pagamento {
	private int tipoPagamento;
	private String formapgmto;
	
	
	public String selecionarTipoPagamento() {
		if(tipoPagamento == 1) {
			return "Dinheiro!";
		}else if(tipoPagamento == 2) {
			return "Cheque!";
		}
		return "Cartão!";
	}
	public String realizarPagamento() {
		return String.format("Forma de pagamento: %s\nEfetuado com sucesso!", selecionarTipoPagamento());
	}
	public void setTipoPagamento(int tipo) {
		this.tipoPagamento = tipo;
	}
}
