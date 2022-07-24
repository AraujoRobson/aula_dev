package exercicios;

public class Atividade7 {
	public String chigoEze() {
		double chico = 1.50, ze = 1.10;
		int anos = 0;
		
		do {
			chico += 0.02;
			ze += 0.03;
			anos++;
		}while(ze < chico);
		
		return ""+anos;
		
	}
}
