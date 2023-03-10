package com.lass.clases;

public class Cuadrado extends FigurasGeometricas{
	private int lado;
	
	public Cuadrado(int lado) {
		super("Cuadrado1");
		this.lado = lado;
	}
	
	@Override
	public double areas() {
		double r = this.lado * this.lado;
		return r;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int getLado() {
		return this.lado;
	}	
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}

}
