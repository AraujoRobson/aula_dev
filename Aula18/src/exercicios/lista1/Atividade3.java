package exercicios.lista1;

public class Atividade3 {
	public double gastoFumante(int anos, int cigarrosDia, double precoCarteira) {
		double montante = cigarrosDia * (anos*365) * (precoCarteira/10);
		return montante;
	}
}
