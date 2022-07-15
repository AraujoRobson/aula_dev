package heranca;

public class JogoDados extends Jogo{
	
	private String tipoDados;
	private int qtdDados;
	
	public void arremessarDado() {
		if(this.getQtdDados() >1) {
			System.out.println("Dados arremessados...");
		}else {
			System.out.println("Dado arremessado...");
		}
	}
	
	public void infoJogoDados() {
		super.infoJogo();
		System.out.println("Tipo de dados: " + this.getTipoDados());
		System.out.println("Quantidade de dados: " + this.getQtdDados());
	}

	public String getTipoDados() {
		return tipoDados;
	}

	public void setTipoDados(String tipoDados) {
		this.tipoDados = tipoDados;
	}

	public int getQtdDados() {
		return qtdDados;
	}

	public void setQtdDados(int qtdDados) {
		this.qtdDados = qtdDados;
	}
	
	

}
