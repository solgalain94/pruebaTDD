package test.test;

public class Calculadora {
	public int divisorDe(int dividendo, int divisor) {
		try {
			return dividendo / divisor;
		} catch(Exception e) {
			return 0;
		}
	}
	public int sumar(int...numeros) {
		int resultado=0;
		for (int numero:numeros) {
			resultado=resultado+numero;
		}
		return resultado;
	}

}
