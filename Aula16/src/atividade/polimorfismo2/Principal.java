package atividade.polimorfismo2;

public class Principal {

	public static void main(String[] args) {
		
		Registros reg = new Registros("Robson",	406104);
		
		reg.escolaridade();
		System.out.println("-------");
		reg.escolaridade("básico", "EEB SÃO MIGUEL");
		System.out.println("-------");
		reg.escolaridade("Unoesc");
	}

}
