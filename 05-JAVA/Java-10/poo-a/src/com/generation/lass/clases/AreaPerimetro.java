package com.generation.lass.clases;

public class AreaPerimetro {
	
	//Cuadrado
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}
	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	//Triangulo
	public double areaTriangulo(double base, double altura) {
		double area = base * altura / 2;
		return area;
	}
	public double perimetroTrianguo (double ladoA, double ladoB, double ladoC) {
		double perimetro = ladoA +ladoB + ladoC;
		return perimetro;
	}
	
	//Circulo
	public double perimetroCirculo(double radio) {
		double perimetro = 2 * (Math.PI * radio);
		return perimetro;
	}
	
	public double areaCirculo(double radio) {
		double area = Math.PI * (radio * radio);
		return area;
	}

}
