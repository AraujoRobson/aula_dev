package exercicios1;

public class Ex1a {

	public static void main(String[] args) {
		try {
			int[] numeros = { 10, 0 };
			System.out.println(numeros[0] / numeros[1]);
		} catch (ArithmeticException e) {
			System.out.println("Impossivel dividir por 0");
		} catch (RuntimeException e) {
			System.out.println("Erro de Runtime.");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro encontrado!");
			System.out.println(e.getMessage());
		}
	}
}
