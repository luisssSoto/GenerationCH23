package oop.clases;

public class Fecha {
	private int dia = 0;
	private int mes = 0;
	private int anio = 0;
	
	
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	public String diaMesAnio() {
		return "La fecha es: ---> " + this.dia + " " + this.mes + " " + this.anio;
		
	}
	
	public void imprimir() {
		System.out.println("La fecha del dia de hoy es: " + this.dia + " " + this.mes + " " + this.anio);
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	
}
