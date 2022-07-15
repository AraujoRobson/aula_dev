package atividade2;

public class Principal {

	public static void main(String[] args) {
		Tecnico tec = new Tecnico();
		Docente docente = new Docente();
		
		tec.setNome("Fulano");
		tec.setSalario(1500);
		tec.setFuncao("OS");
		tec.setHoraExtra(300);
		
		docente.setNome("Ciclano");
		docente.setSalario(3000);
		docente.setTitulacao("Supremo");
		docente.setNivel(5);
		
		tec.calcularSalario();
		docente.calcularSalario();
	}

}
