package model;

import java.util.ArrayList;

public class CadastroPessoas {
	ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	public void cadastrarPessoas(Pessoa p) {
		listaPessoas.add(p);
	}
	
	public String imprimeCadastro(int ind) {
		return String.format("Cliente: %s\nCódigo: ", 
				listaPessoas.get(ind).getNome());
	}
}
