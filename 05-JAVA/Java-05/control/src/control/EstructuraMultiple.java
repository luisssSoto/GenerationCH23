package control;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class EstructuraMultiple {
	Scanner sn1 = new Scanner(System.in);

	public void vocal() {
		// TODO Auto-generated method stub
		System.out.println("Dime una letra: ");
		char caracter = sn1.next().charAt(0);
		switch (caracter) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Es vocal");
			break;
		default:
			System.out.println("No es vocal");
			break;
		}
	}

	public void notas() {
		// TODO Auto-generated method stub
		System.out.println("Dame las notas del alumno ");
		int nota = sn1.nextInt();
		switch (nota) {
		case 10:
			System.out.println("Excelente");
			break;
		case 9:
			System.out.println("Muy bien");
			break;
		case 8:
			System.out.println("Bueno");
			break;
		case 7:
			System.out.println("Regular");
			break;
		case 6:
			System.out.println("Deficiente");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobado");
			break;
		default:
			System.out.println("Fuera del rango");
			break;
		}
	}

	/*
	 * Operador Elvis variable = (PL) ? entrada verdad : entrada falso
	 */
	public void ternario() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un valor: ");
		int entradaV = sn1.nextInt();
		System.out.println("Introduca un segundo valor: ");
		int entradaF = sn1.nextInt();
		int menor = (entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("El resultado menor es: " + menor);
	}
}
