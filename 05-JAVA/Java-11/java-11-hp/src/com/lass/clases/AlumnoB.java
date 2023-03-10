package com.lass.clases;

public class AlumnoB extends PersonaP{
	private int matricula;
	private double promedio;
	

	public AlumnoB(String nombre, int edad, int matricula, double promedio) {
		super(nombre, edad);
		this.matricula = matricula;
		this.promedio = promedio;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public double getPromedio() {
		return promedio;
	}


	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}


	@Override
	public String toString() {
		return "AlumnoB [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	
	public void mostrarDatos() {
		System.out.println(getNombre() + " " + getEdad() + " " + getMatricula() + " " + getPromedio());
	}
	
	public void mostrarDatos(String apellido) {
		System.out.println(getNombre() + " " + apellido + " " + getEdad() + " " + getMatricula() + " " + getPromedio());
	}

}
