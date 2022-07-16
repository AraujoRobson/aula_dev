package atividade.polimorfismo2;

public class Registros {
	
	private String nome, escola, universidade;
	private int codFuncional;
	public Registros(String nome, int codFuncional) {
		super();
		this.nome = nome;
		this.codFuncional = codFuncional;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCódigo Funcional: " + codFuncional;
	}



	public void escolaridade() {
		System.out.println(toString());
	}
	
	public void escolaridade(String nivelEscolar,String escola) {
		System.out.println(toString() + "\nEnsino:" + nivelEscolar +". Escola: " + escola);		
	}
	
	public void escolaridade(String instituicao) {
		System.out.println(toString() + "\nEnsino: Superior. Universidade: " + instituicao);	
	}
	
}
