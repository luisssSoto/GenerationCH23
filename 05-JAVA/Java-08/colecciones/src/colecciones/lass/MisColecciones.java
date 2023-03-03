package colecciones.lass;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class MisColecciones {

	public static void main(String[] args) {
		
		wrapperClass();
		

		MisColecciones c = new MisColecciones();
		imprimir(c.listasColecciones());
		imprimir(c.setCollection());
		mapCollection();
	}
	private static void mapCollection() {
		Map miMap = new HashMap();
		
		miMap.put("valor1: ", "Juan");
		miMap.put("valor2: ", "Maria");
		miMap.put("valor3: ", "Arturo");
		miMap.put("valor4: ", "Karla");
		
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		miMap.remove("valor3: ");
		//miMap.clear();//---->elimina todo
		imprimir(miMap.keySet());
	}
	
	Set setCollection() {
	Set miSet = new HashSet();
	miSet.add("uno");
	miSet.add("dos");
	miSet.add("tres");
	miSet.add("cuatro");
	miSet.add("dos");
	
	System.out.println("size: " + miSet.size());
	System.out.println("remove all: " + miSet.removeAll(miSet));
	System.out.println("mi Set now: " + miSet);
	return miSet;
		
	}
	
	
	private List listasColecciones() {
		
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista: " + miLista.size());
		System.out.println("esta ");
		
		miLista.add("1");
		miLista.add(2);
		miLista.add(3);//hace push a los elementos
		miLista.add(0,"Pato");//añade elementos
		
		miLista.set(0, true);//suplanta elementos 
		miLista.remove(0);//delete any element
		
		System.out.println(miLista + "Tamaño de la lista: " + miLista.size());
		System.out.println("Esta lista esta vacia? " + miLista.isEmpty());
		
		boolean e = miLista.contains("pato");
		System.out.println("-----> " + e);
		
		return miLista;
	
	}


	private static void imprimir(Collection col) {
		for (Object elementos : col) {
			System.out.println("elementos " + elementos);
			
		}
	}
	static void wrapperClass() {
		//byte, short, char, long, float, int, double
		byte numeroB = -12;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor minimo: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo: " + Byte.MAX_VALUE);
		System.out.println("------> " + numeroB);
		
		int numeroI = 4;
		System.out.println("Tamaño de un integer " + Integer.SIZE);
		System.out.println("Valor minimo: " + Integer.MIN_VALUE);
		System.out.println("Valor maximo: " + Integer.MAX_VALUE);
		System.out.println("------> " + numeroI);
		
		short numeroS = 10;
		System.out.println("Tamaño de un short " + Short.SIZE);
		System.out.println("Valor minimo: " + Short.MIN_VALUE);
		System.out.println("Valor maximo: " + Short.MAX_VALUE);
		System.out.println("------> " + numeroS);
		
		long numeroL = 1000;
		System.out.println("Tamaño de un long " + Long.SIZE);
		System.out.println("Valor minimo: " + Long.MIN_VALUE);
		System.out.println("Valor maximo: " + Long.MAX_VALUE);
		System.out.println("------> " + numeroL);
		
		float numeroF = 10000;
		System.out.println("Tamaño de un float " + Float.SIZE);
		System.out.println("Valor minimo: " + Float.MIN_VALUE);
		System.out.println("Valor maximo: " + Float.MAX_VALUE);
		System.out.println("------> " + numeroF);
		
		double numeroD = 1000000;
		System.out.println("Tamaño de un double " + Double.SIZE);
		System.out.println("Valor minimo: " + Double.MIN_VALUE);
		System.out.println("Valor maximo: " + Double.MAX_VALUE);
		System.out.println("------> " + numeroD);
		
		
	}

}
