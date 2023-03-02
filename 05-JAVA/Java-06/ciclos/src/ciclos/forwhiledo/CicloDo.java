package ciclos.forwhiledo;
import java.util.Scanner;

public class CicloDo {
	Scanner sn1 = new Scanner(System.in);
	
	public void digitosDo() {
		int valor, acumulador = 0;
		do {
			System.out.println("Introduca un numero entre 0-9: ");
			valor = sn1.nextInt();
			acumulador += valor;
			System.out.println("---> Aqui esta la suma de acumulador: " + acumulador);
		} while (valor >= 0 && valor <= 9);
		}
	}
