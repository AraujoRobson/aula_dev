package atividade.polimorfismo2;

public class Universidade extends SemEscolaridade{
	
	private String universidade;

	public Universidade(String nome, int codFuncional, String universidade) {
		super(nome, codFuncional);
		this.universidade = universidade;
	}

	@Override
	public String toString() {
		return "----#-----#----\n" + 
				super.toString() + 
				"\nUniversidade: "+ universidade;
	}
	
	

}
