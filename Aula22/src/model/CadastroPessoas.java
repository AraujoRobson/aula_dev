package model;

import java.util.ArrayList;

public class CadastroPessoas {
	ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	public void cadastrarPessoas(Pessoa p) {
		listaPessoas.add(p);
	}
	
	public String imprimeCadastro(int ind) {
		return String.format("Cliente: %s\nC�digo: ", 
				listaPessoas.get(ind).getNome());
	}
}
