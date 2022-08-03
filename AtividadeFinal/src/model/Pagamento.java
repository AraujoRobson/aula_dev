package model;

public class Pagamento {
	private String tipoPagamento, formapgmto;
	
	
	public String selecionarTipoPagamento() {
		if(tipoPagamento == "dinheiro") {
			return "Dinheiro!";
		}else if(tipoPagamento == "pix") {
			return "Pix!";
		}
		return "Cartão!";
	}
	public String realizarPagamento() {
		return String.format("Forma de pagamento: %s\nEfetuado com sucesso!", selecionarTipoPagamento());
	}
	public void setTipoPagamento(String tipo) {
		this.tipoPagamento = tipo;
	}
}
