package testesautomatizados;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import testesmanuais.Calculadora;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();
		
		// Execução (act)
		int soma = calc.somar(41, 1);
		
		// Verificação (assert)
		Assert.assertEquals(42, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}
}