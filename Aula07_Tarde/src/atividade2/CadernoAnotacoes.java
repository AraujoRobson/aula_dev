package atividade2;

import java.util.ArrayList;

public class CadernoAnotacoes {
	ArrayList<String> listaAnotacoes; 

	public CadernoAnotacoes() {
		this.listaAnotacoes = new ArrayList<>();
	}
	
	void adicionarAnotacao(String anotacao) {
		listaAnotacoes.add(anotacao);
	}
	
	void visualizarAnotacoes() {
		
		if (listaAnotacoes.isEmpty() == false) {
			System.out.println(listaAnotacoes);
		}else {
			System.out.println("LISTA VAZIA!!");
		}
	}
	
	void apagarAnotacoes() {
		listaAnotacoes.clear();
	}
	
	
	
	
}
