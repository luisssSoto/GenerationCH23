package com.generation.lass.clases;

public class Persona {
	private String nombre = "Mario";
	private int edad;
	private double altura;
	private double peso;
	private String zodiaco;

	
	public Persona() {
		super();
	}
	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String datosPersonales() {
		return this.nombre + " " + this.edad + " " + this.peso + " " + this.zodiaco + " " + this.zodiaco;
		
	}


	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.zodiaco = zodiaco;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getZodiaco() {
		return zodiaco;
	}
	public void setZodiaco(String zodiaco) {
		this.zodiaco = zodiaco;
	}
	

}
