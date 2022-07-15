package atividade1;

public class Principal {

	public static void main(String[] args) {
		IngressoVIP vip = new IngressoVIP();
		
		vip.setValor(50);
		vip.setValorAdicional(25);
		
		System.out.println("Ingresso: R$" + vip.getValor());
		System.out.println(vip.toString());
		

	}

}
