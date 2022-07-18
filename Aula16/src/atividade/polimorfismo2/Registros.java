package atividade.polimorfismo2;

public class Registros {
	private String nome, nivel, escola, universidade;
	private int codFuncional;
	
	public Registros(String nome, int codFuncional) {
		super();
		this.nome = nome;
		this.codFuncional = codFuncional;
	}

	public Registros(String nome, int codFuncional, String nivelEscolar, String escola) {
		this(nome, codFuncional);
		this.nivel = nivelEscolar;
		this.escola = escola;
	}	
	
	public Registros(String nome, int codFuncional, String nivelEscolar, String escola, String universidade) {
		this(nome, codFuncional, nivelEscolar, escola);
		this.universidade = universidade;
	}
	
	public String imprimir() {
		String registro = "Nome: " + nome + "\nCódigo Funcional: " + codFuncional;
		
		if (nivel == null) {
			return registro;
		}
		
		registro = registro + "\nNível Escolar: " + nivel + "\nEscola: " + escola;
		
		if (universidade == null) {
			return registro;
		}		
		
		return registro + "\nUniversidade: " + universidade;
	}
	
}
