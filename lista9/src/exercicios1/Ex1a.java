package exercicios1;

public class Ex1a {

	public static void main(String[] args) {
		try {
			int[] numeros = {10, 0};
			
			System.out.println(numeros[0] / numeros[2]);
		} catch (Exception e) {
			System.out.println("Erro encontrado!");
			System.out.println(e.getMessage());
		}
	}

}
