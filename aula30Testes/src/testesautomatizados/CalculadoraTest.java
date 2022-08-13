package testesautomatizados;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import testesmanuais.Calculadora;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		// Cen�rio (arrange)
		Calculadora calc = new Calculadora();
		
		// Execu��o (act)
		int soma = calc.somar(41, 1);
		
		// Verifica��o (assert)
		Assert.assertEquals(42, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}
}