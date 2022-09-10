package excecao_persolanizada;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		try {
			System.out.println(calc.dividir(14, 0));
		}catch(ErroDivisaoPorZeroException e) {
			System.out.println(e.getMessage());
			System.out.println(String.format("Divisão %d / 0 falhou", e.getNumerador()));
		}
	}
}
