package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		NuevoHola nh=new NuevoHola("luisssSoto");
		nh.saludo();
		
		String nombre;
		System.out.println("Cual es tu nombre: ");
		nombre=sn.next();
		System.out.println("Tu nombre es: "+nombre);
		
		NuevoHola nh1=new NuevoHola(nombre);
		
	}
}