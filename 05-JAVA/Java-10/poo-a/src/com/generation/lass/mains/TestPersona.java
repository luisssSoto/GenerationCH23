package com.generation.lass.mains;
import com.generation.lass.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		System.out.println(p1.getNombre());
		p1.setNombre("Maria");
		System.out.println(">>>"+p1.getNombre());
		
		
		Persona p2 = new Persona("Pepe");
		System.out.println("---> " + p2.getNombre());
		
		Persona p3 = new Persona("Tata", 90, 1.85, 85.3, "Sagitario");
		System.out.println(p3.datosPersonales());
		
}
}
