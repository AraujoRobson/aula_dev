package exercicios;

import java.util.ArrayList;

public class CadernoAnotacoes {
	ArrayList<String> anotacoes = new ArrayList<>();
	
	public void adicionarAnotacao(String anotacao) {
		anotacoes.add(anotacao);
	}
	public String visualizarAnotacoes() {
		if(anotacoes.isEmpty()) {
			return "Lista Vazia.";
		}
		return anotacoes.toString();
	}
	public void apagarAnotacoes() {
		anotacoes.clear();
	}

}
