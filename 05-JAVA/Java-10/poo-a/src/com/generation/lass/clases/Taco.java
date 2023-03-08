package com.generation.lass.clases;

public class Taco {
	private String tipoDeTortilla = "";
	private String guisado = "";
	private int numeroDeTortilla = 0;
	private String tamanioDeTortilla = "";
	private float precio = 0;
	private boolean salsa;
	
	//Metodos
	
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}

	
	public int preparar(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;	
		return numeroDeTortilla;	
	}
	
	public float vender(float precio, int numeroDeTortilla) {
		float total = precio * numeroDeTortilla;
		return total;
	}
	
	public String ponerSalsa(boolean salsa) {
		this.salsa = salsa;
		String s = null;
		if (salsa == true) {
			s = "Con salsita";
		}
		else {
			s = "Sin salsita";
		}
		return s;
	}
	
	public double subirPrecio(double precio) {
		this.precio += precio;
		return precio;
	}
	



	@Override
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + ", salsa="
				+ salsa + "]";
	}


	//Metodos de acceso
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public boolean getSalsa() {
		return this.salsa;
	}
	public void setSalsa(boolean salsa) {
		this.salsa= salsa;
	}

}
