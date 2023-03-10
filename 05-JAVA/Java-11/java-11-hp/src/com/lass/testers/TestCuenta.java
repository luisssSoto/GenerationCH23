package com.lass.testers;
import com.equipo.cuenta.clases.*;
public class TestCuenta {
	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente(1000, 100);
		System.out.println(cuenta1.getSaldo());
		cuenta1.consignar(100);
		System.out.println(cuenta1.getSaldo());
	}
}
