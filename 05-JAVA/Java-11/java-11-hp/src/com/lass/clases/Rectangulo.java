package com.lass.clases;
import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
	
	private double altura;
	private double base;

	public Rectangulo(double base, double altura) {
		super("Rectangulo1");
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		double r = this.base * this.altura;
		return r;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void pedirDatos() {
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Introduzca la base: ");
		double base = sn1.nextDouble();
		setBase(base);
		
		System.out.println("Introduzca la altura: ");
		this.setAltura(sn1.nextDouble());
	}


}
