package com.equipo.cuenta.clases;

public class CuentaAhorros extends Cuenta{
	/*• Cuenta de ahorros: posee un atributo para determinar si la cuenta de ahorros está activa (tipo
			boolean). Si el saldo es menor a $10 000, la cuenta está inactiva, en caso contrario se considera
			activa. */
	private boolean activa;
	
//luisssSoto
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
	}
	
	public void consignar(float nCantidad) {
		this.saldo += nCantidad;
	}
	
	public void retirar(float nCantidad) {
		this.saldo -= nCantidad;
	}
	
	public void extractoMensual() {
	}	
	
	public void imprimir() {

	}
	
	

}
