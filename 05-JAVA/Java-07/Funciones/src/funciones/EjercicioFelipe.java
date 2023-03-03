package funciones;
import java.util.Scanner;
/*Calcula la altura de una torre
 * que se encuentra a 100 metros 
 * de una persona, que observa la punta
 * de la torre con un angulo de 
 * elevacion de 30°
 * 
 * Estatura de la persona
 * Torre recta
 * Tipos de datos
 * 
 * Levantamiento de requerimientos

- Torre es recta (90grados)
- Usen funciones de la librera Math
- Tiempo es de 20 minutos
- Impresiones en consola de todos los datos
    / tu base es de
    / tu altura
- Datos del tipo double o float
 */


public class EjercicioFelipe {
 


private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N % 2 != 0){
            System.out.println("Weird");
        }
        else{
            if (N >= 2 || N <= 5) {
                System.out.println("Not Weird");
                
            } else if (N >= 6 || N <= 20) {
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        scanner.close();
	}
	
	public static void torre(int grados) {
		float altura = 0;
		System.out.println("La base de la torre es de: " + Math.tan(grados));
		System.out.println("La altura de la torre es: ");
		
	}
	
}
