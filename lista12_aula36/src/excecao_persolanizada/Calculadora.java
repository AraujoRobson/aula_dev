package excecao_persolanizada;

public class Calculadora {
	public static int dividir(int num1, int num2) throws ErroDivisaoPorZeroException {
		if(num2 == 0) {
			throw new ErroDivisaoPorZeroException("Erro de divisão por zero!", num1);
		}
		int resultado = num1 / num2;
		return resultado;
	}
}
