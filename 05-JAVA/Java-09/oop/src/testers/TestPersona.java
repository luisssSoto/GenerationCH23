package testers;

import oop.clases.Persona;
import oop.clases.Fecha;

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
		
		
		//Fecha
		Fecha f1 = new Fecha(06, 03, 2023);
		f1.imprimir();
		System.out.println(f1.diaMesAnio());
		
		}

}
