package atividade1;

public class Contas {

	public static void main(String[] args) {
		
		ContaPoupanca poup = new ContaPoupanca("Robson", 1516);
												//nome, numConta, limite
		ContaEspecial especial = new ContaEspecial("Luiz", 9832, 2000);
		
		
		//POUPAN�A
		poup.depositar(50000);
		poup.sacar(0);
		poup.setDiaRendimento(30);
		System.out.println(poup.toString());
		System.out.println("-----------");
		
		//ESPECIAL
		especial.depositar(4000);
		especial.sacar(0);
		System.out.println(especial.toString());
		System.out.println("-----------");

	}

}
