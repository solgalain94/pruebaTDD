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
	public void saldoCero() {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		int saldo=cuentaBancaria.getSaldo();
		assertEquals(0,saldo);
	}

}
