package heranca;

public class JogoCartas extends Jogo {
	
	private int qtdCartas;
	private String tamanhoCartas;
	
	public void comprarCarta() {
		System.out.println("Carta comprada...");
	}
	
	public void descartarCarta() {
		System.out.println("Carta descartada...");
	}
	
	public void jogarCarta() {
		System.out.println("Carta jogada...");
	}
	
	public void infoJogoCartas() {
		super.infoJogo();
		System.out.println("Quantidade de cartas: " + this.getQtdCartas());
		System.out.println("Tamanho das cartas: " + this.getTamanhoCartas());
	}

	public int getQtdCartas() {
		return qtdCartas;
	}

	public void setQtdCartas(int qtdCartas) {
		this.qtdCartas = qtdCartas;
	}

	public String getTamanhoCartas() {
		return tamanhoCartas;
	}

	public void setTamanhoCartas(String tamanhoCartas) {
		this.tamanhoCartas = tamanhoCartas;
	}
	
	

}
