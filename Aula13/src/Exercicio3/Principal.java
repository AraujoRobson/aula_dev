package Exercicio3;

public class Principal {

	public static void main(String[] args) {
												//NOME	,	ENDERE�O	,	TELEFONE 
		Fornecedor fornecedor = new Fornecedor("ABC LTDA", "Rua Goiabinha", "49 7070 7070");
		Empregado empregado = new Empregado("Fulado da Silva Santos", "Av Faria Lima", "49 1020 3040");
		Administrador adm = new Administrador("Ciclano", "Morumbi", "11 98477 6457");
		Operario operario = new Operario("Beltrano", "Av Leopoldo Bulh�es", "21 97432 8787");
		Vendedor vendedor = new Vendedor("Francisquinho", "Rua John Kennedy", "49 3622 0000");
		
		//FORNECEDOR
		fornecedor.setValorCredito(1000);
		fornecedor.setValorDivida(300);
		System.out.println("Fornecedor.");
		System.out.println(fornecedor.toString());
		System.out.println("-------");
		
		//EMPREGADO
		empregado.setSalarioBase(3000);
		empregado.setCodSetor(20);
		empregado.setImposto(179);
		System.out.println("Empregado.");
		System.out.println(empregado.toString());
		System.out.println("-------");
		
		//ADMINISTRATIVO
		adm.setSalarioBase(empregado.getSalarioBase());
		adm.setAjudaCusto(500);
		adm.setCodSetor(1);
		adm.setImposto(empregado.getImposto());
		System.out.println("Admnistrador.");
		System.out.println(adm.toString());
		System.out.println("-------");
		
		//OPERARIO
		operario.setSalarioBase(empregado.getSalarioBase());
		operario.setValorProducao(10000);
		operario.setCodSetor(7);
		operario.setImposto(empregado.getImposto());
		System.out.println("Operario.");
		System.out.println(operario.toString());
		System.out.println("-------");
		
		//VENDEDOR
		vendedor.setSalarioBase(empregado.getSalarioBase());
		vendedor.setValorVendas(10000);
		vendedor.setCodSetor(7);
		vendedor.setImposto(empregado.getImposto());
		System.out.println("Operario.");
		System.out.println(vendedor.toString());
		System.out.println("-------");
	}

}
