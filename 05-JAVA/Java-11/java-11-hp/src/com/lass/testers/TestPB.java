package com.lass.testers;
import com.lass.clases.AlumnoB;
import com.lass.clases.PersonaP;
public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlumnoB alumno1 = new AlumnoB("alex", 10, 123, 8.5);
		System.out.println(alumno1.getNombre());
		System.out.println(alumno1.getPromedio());
		System.out.println(alumno1.toString());
		
		PersonaP persona1 = new PersonaP("Karen", 15);
		
		alumno1.mostrarDatos();
		alumno1.mostrarDatos("Copca");
		
	}

}
