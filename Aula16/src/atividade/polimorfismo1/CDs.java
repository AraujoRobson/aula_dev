package atividade.polimorfismo1;

public class CDs extends Estoque{
	
	private int numFaixas;

	public CDs(String nome, double preco, int faixas) {
		super(nome, preco);
		this.numFaixas = faixas;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nNumero de Faixas: " + numFaixas + "\n------------";
	}


	
	
	

}
