package com.generation.lass.mains;
import com.generation.lass.clases.AreaPerimetro;
import com.generation.lass.clases.FigurasGeometricas;
public class TestAreaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaPerimetro cuadrado1 = new AreaPerimetro();
		System.out.println("----> " + cuadrado1.areaCuadrado(5));
		FigurasGeometricas fg1 = new FigurasGeometricas();
		fg1.setArea(cuadrado1.areaCuadrado(5));
		System.out.println("Area cuadrado---> " + fg1.getArea());
		
		fg1.setPerimetro(cuadrado1.perimetroCuadrado(5));
		System.out.println("Area trinagulo ----> " + fg1.getPerimetro());
		
		FigurasGeometricas circulo1 = new FigurasGeometricas();
		circulo1.setRadio(4);
		AreaPerimetro ap1 = new AreaPerimetro();
		System.out.println("circunferencia: " + ap1.perimetroCirculo(circulo1.getRadio()));
		System.out.println("area: " + ap1.areaCirculo(circulo1.getRadio()));
		
	}

}
