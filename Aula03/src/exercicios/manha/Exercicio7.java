package exercicios.manha;


public class Exercicio7 {

	public static void main(String[] args) {
		
		float chico = (float) 1.50, ze = (float) 1.10;
		int anos=0;
		
		do {
			chico =  (float) (chico + 0.02);
			ze = (float) (ze + 0.03);
			anos++;
		}while(ze<chico);
		
		System.out.println("Zé levará "+anos+" anos para passar Chico");
	}
}
