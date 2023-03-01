package control;
import java.util.Scanner;

public class EstructuraIf {
	//method 1
	public void controlIf() {
		System.out.println("Soy un metodo de Estructura If");
		
		System.out.println("Ingresa la nota del alumno: ");
		Scanner sn1 = new Scanner(System.in);
		long nota = sn1.nextInt();
		
//if simple
		if (nota >= 5) {
			System.out.println("Nota aprobatoria " + nota);
		}
		System.out.println();
		
//if else 
		if (nota >= 5 ) {
			System.out.println("Nota aprobatoria " + nota);
		}
		else {
			System.out.println("Nota no aprobatoria " + nota);
		}
		System.out.println("Continuamos con el flujo del programa ");
	}
	//method 2
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.println("Ingresa el primer valor: ");
		Scanner sn2 = new Scanner(System.in);
		int n1 = sn2.nextInt();
		System.out.println("Introduzca el segundo dato: ");
		int n2 = sn2.nextInt();
		if (n1 % n2 == 0) {
			System.out.println("El numero " + n1 + " es divisible entre " + n2 );
		}
		else {
			System.out.println("El numero " + n1 + " no es divisible entre " + n2);
		}
	}
	//method 3
	public void compara() {
		// TODO Auto-generated method stub
		Scanner sn3 = new Scanner(System.in);
		System.out.println("Ingresa el primer valor: ");
		int val1 = sn3.nextInt();
		System.out.println("Ingresa el segundo valor: ");
		int val2 = sn3.nextInt();
		if (val1 > val2) {
			System.out.println(val1 + " es mayor que " + val2);
		}
		else {
			System.out.println(val1 + " es menor que " + val2);
		}	
	}
	
	//method 4 if anidado
	public void anidado() {
		// TODO Auto-generated method stub
		Scanner sn4 = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int number1= sn4.nextInt();
		if (number1 > 0) {
			System.out.println("El numero " + number1 + " es positivo");
		}
		else if (number1 < 0) {
			System.out.println("El numero " + number1 + " es negativo");
		}
		else {
			System.out.println("Tu numero es 0 verdad...");
			
		}

	}
}
