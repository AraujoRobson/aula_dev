package heranca;

public class JogoTabuleiro extends Jogo {

	private String tamanhoTabuleiro;
	private int qtdPecas;
	
	public void setupTabuleiro() {
		System.out.println("Tabuleiro Montado!");
	}
	
	public void moverPecas() {
		System.out.println("Peça movimentada");
	}
	
	public void infoJogoTabuleiro() {
		super.infoJogo();
		System.out.println("Tamanho do Tabuleiro: " + this.getTamanhoTabuleiro());
		System.out.println("Quantidade de Peças: " + this.getQtdPecas());
	}

	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}

	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}

	public int getQtdPecas() {
		return qtdPecas;
	}

	public void setQtdPecas(int qtdPecas) {
		this.qtdPecas = qtdPecas;
	}
	
	
}
