package atividade.polimorfismo2;

public class Escola extends SemEscolaridade{

	private String nivel,escola;
	
	public Escola(String nome, int codFuncional, String escola, String nivel) {
		super(nome, codFuncional);
		this.escola = escola;
		this.nivel = nivel;
		
	}
	

	@Override
	public String toString() {
		return "----#-----#----\n" + 
				super.toString() + 
				"\nNivel: " + nivel + "\nEscola: " + escola;
	}

}
