package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaldoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saldoInicialcero() {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		int saldo=cuentaBancaria.getSaldo();
		assertEquals(0,saldo);
	}
	@Test
	public void agregarSaldo() {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		cuentaBancaria.agregarSaldo(200);
		int saldo=cuentaBancaria.getSaldo();
		assertEquals(200,saldo);
	}
	@Test
	public void restarSaldo() {
		CuentaBancaria cuentaBancaria= new CuentaBancaria();
		cuentaBancaria.restarSaldo(125);
		int saldo= cuentaBancaria.getSaldo();
		assertEquals(75, saldo);
	}
	

}
