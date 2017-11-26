package test.test;

public class CuentaBancaria {
	private int saldo=0;
	public int getSaldo() {
		return this.saldo;
	}
	public void agregarSaldo(int valor) {
		this.saldo=this.saldo+valor;
	}

}
