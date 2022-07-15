package atividade1;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	private double taxaRendimento;
	
	public ContaPoupanca(String cliente, int numConta) {
		super(cliente, numConta);
	}
	
	public double calcNovoSaldo() {
		int i;
		this.taxaRendimento = 0.0005;  //por dia
		for (i = 1; i <= this.diaRendimento; i++) {
			this.saldo = (super.getSaldo()+(super.getSaldo()*this.taxaRendimento));
		}
		return super.getSaldo();
	}
	
	

	@Override
	public String toString() {
		return super.toString() + 
				"\nDias de rendimento: " + diaRendimento +
				"\nSaldo com rendimentos: " + calcNovoSaldo();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	

}
