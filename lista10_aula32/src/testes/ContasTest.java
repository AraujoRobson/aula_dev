package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Cliente;
import model.ContaCorrente;
import model.ContaEspecial;

public class ContasTest {	
	Cliente robson = new Cliente("Robson");
	
	@Test
	public void testaSaqueCC() {
		ContaCorrente cc = new ContaCorrente(robson, 1000);
		double saque = cc.sacar(500);
		assertEquals(500, saque);
	}
	
	@Test
	public void testaDepositoCC() {
		
	}
	
	@Test
	public void testaSaqueCE() {
		
	}
	
	@Test
	public void testaDepositoCE() {
		
	}
}
