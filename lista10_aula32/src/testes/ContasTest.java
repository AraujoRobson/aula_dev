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
		double saque = cc.sacar(-500);
		assertEquals(1000, saque);
	}
	
	@Test
	public void testaDepositoCC() {
		ContaCorrente cc = new ContaCorrente(robson, 0);
		double deposito = cc.depositar(-255);
		assertEquals(0, deposito);
	}
	
	@Test
	public void testaSaqueCE() {
		ContaEspecial ce = new ContaEspecial(robson, 100, 450);
		double saque = ce.sacar(600);
		assertEquals(100, saque);
	}
	
	@Test
	public void testaDepositoCE() {
		ContaEspecial ce = new ContaEspecial(robson, 100, 430);
		double deposito = ce.depositar(400);
		assertEquals(500, deposito);
	}
}
