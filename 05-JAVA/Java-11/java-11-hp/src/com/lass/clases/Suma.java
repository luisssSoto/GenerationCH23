package com.lass.clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	
	private double value1;
	private double value2;
	
	public Suma() {
		
	}
	public Suma(double value1, double value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	
	@Override
	public double sumar() {
		return this.value1 + value2;
	}
	@Override
	public double restar() {
		return 0;
	}
	@Override
	public double multiplicar() {
		return 0;
	}
	@Override
	public double dividir() {
		return 0;
	}
	
	@Override
	public void mensaje() {
		System.out.println("Soy una suma");
	}

}
