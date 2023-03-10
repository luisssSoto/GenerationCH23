package com.lass.testers;

import com.lass.clases.*;

public class TestFigurasGeometricas {
	
	public static void main(String[] args) {
		//Rectangulo
		FigurasGeometricas rectangulo1 = new Rectangulo(10,2);
		System.out.println(rectangulo1.areas());
		System.out.println(rectangulo1.toString());
		rectangulo1.pedirDatos();
		System.out.println(rectangulo1.toString());
		System.out.println(rectangulo1.areas());
		
		//Circulo
		FigurasGeometricas circulo1 = new Circulo(5);
		System.out.println(circulo1.areas());
		System.out.println(circulo1.toString());
		
		//Triangulo
		FigurasGeometricas triangulo1 = new Triangulo(5, 10);
		System.out.println(triangulo1.areas());
		System.out.println(triangulo1.toString());
		
		//Cuadrado
		FigurasGeometricas cuadrado1 = new Cuadrado(10);
		System.out.println(cuadrado1.areas());
		System.out.println(cuadrado1.toString());
	}
}
