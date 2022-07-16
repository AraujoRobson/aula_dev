package atividade.polimorfismo3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Assalariado assalariado = new Assalariado("Pedrinho", "da Silva", "123.321.425-84");
		Comissionado comissionado = new Comissionado("Fabio", "Fagundes", "123.456.789-01");
		Horista horista = new Horista("Carlos", "Nobrega", "853.879.649-01");
		
		assalariado.setSalario(1500);
		comissionado.setTaxaComissao(10);
		comissionado.setTotalVenda(5000);
		horista.setHorasTrab(176);
		horista.setPrecoHora(10);
		
		System.out.println(assalariado.toString());
		System.out.println("-------------");
		System.out.println(comissionado.toString());
		System.out.println("-------------");
		System.out.println(horista.toString());
	

	}

}
