package exercicios.lista1;

public class Atividade8 {
	public int potenciacao(int base, int expoente) {
		int resultado = 0;
		for(int i = 0; i < expoente; i++) {
			resultado = base * base;
		}
		return resultado;
	}
}
