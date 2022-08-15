package testesautomatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import testesmanuais.Calculadora;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		// Cenario (arrange)
		Calculadora calc = new Calculadora();

		// Execucao (act)
		int soma = calc.somar(41, 1);

		// Verificacao (assert)
		assertEquals(42, soma);
	}

	@Test
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		assertEquals(10, soma);
	}

	@Test
	public void deveriaSomarUmNumeroPositivoComNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		assertEquals(0, soma);
	}

	@Test
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2, -3);
		assertEquals(-5, soma);
	}
}