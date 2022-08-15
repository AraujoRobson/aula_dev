package testesautomatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import testesmanuais.Calculadora;

public class CalculadoraTest {
	// SOMAR
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

	// SUBTRAIR
	@Test
	public void deveriaSubtrairDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(20, 5);
		assertEquals(15, subtrair);
	}

	@Test
	public void deveriaSubtrairUmNumeroNegativoPorUmPositivo() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(-20, 5);
		assertEquals(-25, subtrair);
	}

	@Test
	public void deveriaSubtrairUmNumeroPositivoPorUmNegtivo() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(22, -5);
		assertEquals(27, subtrair);
	}

	@Test
	public void deveriaSubtrairDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(-40, -15);
		assertEquals(-25, subtrair);
	}

	@Test
	public void deveriaSubtrairUmNumeroPositivoPorZero() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(18, 0);
		assertEquals(18, subtrair);
	}

	@Test
	public void deveriaSubtrairZeroPorUmNumeroPositivo() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(0, 22);
		assertEquals(-22, subtrair);
	}

	@Test
	public void deveriaSubtrairZeroPorUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int subtrair = calc.subtrair(0, -22);
		assertEquals(22, subtrair);
	}

	// MULTIPLICACAO
	@Test
	public void deveriaMultiplicarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int multiplicar = calc.multiplicar(10, 10);
		assertEquals(100, multiplicar);
	}

	@Test
	public void deveriaMultiplicarNumeroPositivoNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int multiplicar = calc.multiplicar(27, -10);
		assertEquals(-270, multiplicar);
	}

	@Test
	public void deveriaMultiplicarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int multiplicar = calc.multiplicar(-27, -18);
		assertEquals(486, multiplicar);
	}

	@Test
	public void deveriaMultiplicarNumeroPositivoPorZero() {
		Calculadora calc = new Calculadora();
		int multiplicar = calc.multiplicar(557, 0);
		assertEquals(0, multiplicar);
	}

	@Test
	public void deveriaMultiplicarNumeroNegativoPorZero() {
		Calculadora calc = new Calculadora();
		int multiplicar = calc.multiplicar(-7, 0);
		assertEquals(0, multiplicar);
	}
}