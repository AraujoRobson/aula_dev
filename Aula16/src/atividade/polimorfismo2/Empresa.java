package atividade.polimorfismo2;

public abstract class Empresa {
	
	
	private String nome;
	private int codFuncional;
	

	public Empresa(String nome, int codFuncional) {
		super();
		this.nome = nome;
		this.codFuncional = codFuncional;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + "\nCódigo Funcional: " + codFuncional;
	}

	
	
}
