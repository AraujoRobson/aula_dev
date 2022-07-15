package metodos;

public class ProcedimentoComParametro {

	static float num1, num2, resposta;
	
	public static float soma(float x, float y) {
		float aux;
		aux = x + y;
		return aux;
	}
	public static void subtracao(float x, float y) {
		resposta = x - y;
	}

	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		
		soma(num1,num2);
		System.out.println(resposta);
		subtracao(num1,num2);
		System.out.println(resposta);
		
	}

}
