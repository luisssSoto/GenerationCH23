package com.generation.lass.ManejoExcepciones;

public class Division {
	private int numerador = 0;
	private int denominador = 0;

	public Division(int numerador, int denominador)throws OpExceptions {
		
		if(denominador == 0) {
			throw new OpExceptions("el denominador es un cero 0");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public void visualizarD() {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la division es: " + (this.numerador/this.denominador));

	}

}
