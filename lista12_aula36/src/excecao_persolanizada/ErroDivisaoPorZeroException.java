package excecao_persolanizada;

public class ErroDivisaoPorZeroException extends ArithmeticException{
	private int numerador;
	
	public int getNumerador() {
		return this.numerador;
	}

	public ErroDivisaoPorZeroException(String s,int numerador) {
		super(s);
		this.numerador = numerador;
	}
}
