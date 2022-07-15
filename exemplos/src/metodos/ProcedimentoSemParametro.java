package metodos;

public class ProcedimentoSemParametro {

	static float num1, num2, resposta;
	
	public static void soma() {
		resposta = num1 + num2;
	}
	public static void subtracao() {
		resposta = num1 - num2;
	}
	
	public static void main(String[] args) {
		num1 = 10;
		num2 = 5;
		
		soma();
		System.out.println(resposta);
		subtracao();
		System.out.println(resposta);
		
	}

}
