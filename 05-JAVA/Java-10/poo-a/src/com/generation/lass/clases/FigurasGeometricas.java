package com.generation.lass.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	private double radio;
	
	public FigurasGeometricas() {
		
	}
	public FigurasGeometricas(double perimetro, double area) {
		super();
		this.perimetro = perimetro;
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public void setRadio(double radio) {
		this.radio= radio;
		
	}
	
}
