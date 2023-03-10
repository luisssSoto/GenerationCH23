package com.lass.clases;

public class Triangulo extends FigurasGeometricas{
	
	private int altura;
	private int base;
	
	public Triangulo(int altura, int base) {
		super("Triangulo1");
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double areas() {
		double r = this.base * this.altura / 2;
		return r;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return this.base;
	}
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
}
