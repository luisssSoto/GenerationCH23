package ciclos.forwhiledo;
import java.util.Scanner;
public class UsoWhile {
	
	Scanner sn1 = new Scanner(System.in);
	
	public void cicloW() {
		System.out.println("Ciclo while");
		int iterador = 0;
		while (iterador < 10) {
			System.out.println("Iterador " + iterador);
			iterador++;
		}
	}
	public void centinelaW() {
		final int centinela = -1;
		System.out.println("Introduca una nota: ");
		int nota = sn1.nextInt();
		while (nota != centinela) {
			System.out.println("Centinela");
			System.out.println("La nota es: " + nota);
			System.out.println("Introduca una nota: ");
			nota = sn1.nextInt();
			}
		System.out.println("Final del ciclo");
		}
	
	public void banderaW() {
		boolean valorb = false;
		while (!valorb){
			System.out.println("Dame un numero entero: ");
			int valorx = sn1.nextInt();
			if (valorx > 0 && valorx <= 10) {
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println("La potencia de: " + valorx + " = " + potaxio);
			} else {
				System.out.println("Salimos de While");
				valorb = true;

			}
			
		}
	}

	}
