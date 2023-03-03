package funciones;

public class Funciones {//clase Funciones
	
	//las funciones se pueden declarar en cualquier lugar excepto en main()
	//funcion return
	public static int sumar(int n1, int n2){
		int rSuma = n1 + n2;
		return rSuma;
	}
	public static int restar(int n1, int n2) {
		int rResta = n1 - n2;
		return rResta;
	}
	public static int multiplicar(int n1, int n2){
		int rMultiplicacion = n1 * n2;
		return rMultiplicacion;
	}
	public static int dividir(int n1, int n2) {
		int rDivision = n1 / n2;
		return rDivision;
	}
	//añadir varios tipos de datos
	public static float sumaDecimal(float n1, int n2) {
		float rSumaDec = n1 + n2;
		return rSumaDec;
	}
	
	//Se puede castear el resultado
	public static float sumaDecimal1(float n1, int n2) {
		int rSumaDec = (int)n1 + n2;
		return rSumaDec;
	}
	
	public static String recipe(String in1, String in2, String in3) {
		String recipeComplete = in1 + in2 + in3;
		return recipeComplete;
	}
	
	//funcion void
	public static void printAsteriscos() {
		System.out.println("*********");
	}
	
	public static void main(String[] args) {
		System.out.println("El resultado de la suma es: " + sumar(5, 5));
		
		printAsteriscos();
		
		System.out.println(sumaDecimal(10.37f, 5));
		
		System.out.println(sumaDecimal1(10.37f, 5));
		
		//recipe
		System.out.println("La receta secreta es: " + recipe("Agua ", "Limon ", "Azucar"));
		
		
		//Biblioteca Math
		double valorEjemplo = 7.65497834d;
		System.out.println("La raiz cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
	}
}

/*
Funciones son de 2 tipos
-funciones no retornan valor: no se necesita la palabra return solo llevan void
-funciones que retornan valor: se necesita el tipo de dato que va a retornar por ello tambien llevan return y no llevan void 

las funciones:
son aisladas
necesitan ser estaticas (static)
se usan en cualuier lugar d ela clase

metodos
pertenecen a un objeto
no necesitan ser estaticas
se pueden usar en cualquier lugar de la clase
*/