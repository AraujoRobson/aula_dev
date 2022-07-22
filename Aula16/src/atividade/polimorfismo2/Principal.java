package atividade.polimorfismo2;

public class Principal {

	public static void main(String[] args) {
		
		Registros reg1 = new Registros("Robson", 406104);
		Registros reg2 = new Registros("Pedro", 123, "Básico", "EEB SM");
		Registros reg3 = new Registros("Maria", 435352, "Médio", "EEB SM");
		Registros reg4 = new Registros("Jéssica", 7643, "Superior", "EEB SM", "UNOESC");
		
		System.out.println(reg1.imprimir());
		System.out.println("--------");
		System.out.println(reg2.imprimir());
		System.out.println("--------");
		System.out.println(reg3.imprimir());
		System.out.println("--------");
		System.out.println(reg4.imprimir());
		
		
		
	}

}
