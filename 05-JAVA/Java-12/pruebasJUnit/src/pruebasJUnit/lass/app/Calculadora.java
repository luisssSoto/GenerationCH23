package pruebasJUnit.lass.app;

public class Calculadora {
	protected int value1 = 0;
	protected int value2 = 0;
	
	public int sumar(int value1, int value2) {
		//this.value1 = value1;
		//this.value2 = value2;
		return value1 + value2;
	}
	public int restar(int value1, int value2) {
		//this.value1 = value1;
		//this.value2 = value2;
		return value1 - value2;
	}
	
	public double division(double d1, double d2) {
		return d1/d2;
	}
	
	public void divisionByZero(double v1, double v2) {
		if (v2 == 0) {
			throw new ArithmeticException("NO se puede dividir entre cero")
		}
		return (v1 / v2);
	}
	

}
