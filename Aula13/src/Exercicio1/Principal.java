package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
		AssistenteTecnico assistTec = new AssistenteTecnico("Técnico", 2000, 100, 100);
		AssistenciaAdm assistAdm = new AssistenciaAdm("ADM", 3000, 2, 500);
		
		
		
		
		assistTec.exibeDados();
		System.out.println("--------------");
		
		assistAdm.exibeDados();
	}

}
