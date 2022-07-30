package model;

public class Pagamento {
	private int tipoPagamento;
	private String formapgmto;
	
	public void selecionarTipoPagamento(int pag) {
		this.tipoPagamento = pag;
		switch (this.tipoPagamento){
			case 1:
				formapgmto = "dinheiro";
				break;
			case 2:
				formapgmto = "cheque";
				break;
			case 3:
				formapgmto = "cartão";
				break;
		}
	}
	public String realizarPagamento() {
		return String.format("Forma de pagamento: %s\nEfetuado com sucesso!", this.formapgmto);
	}
}
