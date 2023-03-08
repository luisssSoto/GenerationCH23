package com.generation.lass.ManejoExcepciones;
import java.util.Scanner;
public class NoComprobadasExceptions {
	public static void main(String[] args) {
		//int division = 10/10;
		//System.out.println("---> " + division);
	
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Introduca un valor: ");
		int divisor;
		
		
	try {
		divisor = Integer.parseInt(sn1.next());
		int division1 = 10/divisor;
		System.out.println("---> " + division1);
	}
	catch(ArithmeticException e) {
		System.out.println("cpaturando la exception " + e.getMessage());
	}catch(NumberFormatException nfe) {
		System.out.println("El dato es un caracter: " + nfe.getMessage() );
	}finally {
		System.out.println("Este block es el ultimo y se va a ejecutar  con o sin la exception");
	}
	
	System.out.println("Continuamos con el flujo normal de la aplicacion");


}
}