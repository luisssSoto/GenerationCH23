package com.lass.testers;
import com.lass.clases.OperacionesAritmeticas;
import com.lass.clases.Suma;
import com.lass.clases.Mensajes;

public class TestOperacionesAritmeticas {
	public static void main(String[] args) {
		
		Suma suma1 = new Suma(5,2);
		OperacionesAritmeticas oa1 = new Suma(10,3);
		
		
		System.out.println("Suma: " + suma1.sumar());
		System.out.println("Operaciones Aritmeticas: " + oa1.sumar());
		suma1.mensaje();
		
		Mensajes mensaje1 = new Suma();
		mensaje1.mensaje();
	}
}
