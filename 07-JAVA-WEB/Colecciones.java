package Colecciones;


//Todas las importaciones que estaremos trabajando cuando usemos Colecciones
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
	
		
		
		System.out.println("******* Ejemplo de Array *******");
		//Array para una lista de refacciones
		
		//Definir es nuestro arreglo. Especifica el tipo de dato
		String [] listaDeRefacciones = new String[] {"bujias", "filtro de aire", "banda de distribucion", "aceite"};
		
		//for each = para cada
		
		//sintaxis es for(tipoElemento variableDondeAlmaceno : DeDondeSacoElElemento)
		//para mi lista de refacciones, saca un producto de ahi y ponlo en una variable llamada producto
		for(String productoSacadoDeLaLista : listaDeRefacciones) {
			System.out.println(productoSacadoDeLaLista);
		}//cierre del for each
		
		
		
		//Ejemplo de conjunto para cartas de un mazo de pokar
		
		//Creo un nuevo SET con datos de tipo STRING llamado CARTASDEJUEGO, y sera un NUEVO OBJETO del tipo HASHSET 
		Set<String> cartasDeJuego = new HashSet<>();
		//para agregar elementos a mi SET, uso un metodo .add
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("As de diamantes");
		cartasDeJuego.add("As de picas");
		cartasDeJuego.add("As de treboles");
		cartasDeJuego.add("Reina de corazones");
		
		
		//Como sabre que elemento existe en mi conjunto?
		if(cartasDeJuego.contains("Reina de treboles")) {
			System.out.println("La Reina de treboles si esta en el conjunto");
		}//cierre de hashSet
		
		
		
		
		//Ejemplo de MAP para libreta de direcciones
		Map<String, String> libretaDeDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones
		libretaDeDirecciones.put("Felipe Maqueda", "Tlalnepantla de Baz");
		libretaDeDirecciones.put("Alexis Castaneda", "Guadalajara");
		libretaDeDirecciones.put("Aura Rodriguez", "Estado de Mexico");
		
		//Traer la direccion de Alexis
		String direccionAlexis = libretaDeDirecciones.get("Alexis Castaneda");
		System.out.println(direccionAlexis);
		
		//Tamanio antes de borrar
		System.out.println("El tamanio antes de borrar es de: " + libretaDeDirecciones.size());
		
		//Remover un contacto de mi libreta de direccion (Felipe Maqueda)
		libretaDeDirecciones.remove("Felipe Maqueda");
		
		
		//Tamanio despues de borrar
		System.out.println("El tamanio despues de borrar es de: " + libretaDeDirecciones.size());
		

	}//cierre de main

}//cierre de clase

/*

	Colecciones o Collections
	
		- Array
		
	Estructura de datos lineal, siempre contiene datos del mismo tipo. Los datos estan almacenados de forma contigua en la memoria. Se accede a los elementos a traves de un indice.
	
		- Tamanio fijo
		- Acceso rapido
		- Coste elevado para insertar o eliminar elementos. 
		
		
	
		- Set (conjuntos)
	Estructuras de datos que almacena elementos unicos y sin orden.
	
		- No hay elementos elementos duplicados. Si trato de agregar un elemento repetido, el conjunto lo ignora.
		- No hay orden especifico (puede ser bueno o malo para acceder a la informacion)
		- Busqueda rapida: hay funciones especificas de este conjunto para buscar informacion
	
		
		
		
		- Map (mapas)
	Estructura de datos que almacena informacion en pares de clave-valor. 
		
		- Almancena informacion en pares (clave unica)
		- No hay orden especifico 
		- Busqueda rapida: si conozco la llave, conozco el dato que puedo tomar
		
		
		
		
		- ArrayList
		- HashSet
		- HashMap


*/