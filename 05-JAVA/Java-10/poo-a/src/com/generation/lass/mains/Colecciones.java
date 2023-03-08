package com.generation.lass.mains;

import java.util.ArrayList;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList coleccion1 = new ArrayList();
		coleccion1.add("colecciones");
		coleccion1.add(13);
		coleccion1.add(15.15);
		coleccion1.add('a');
		
		for (int i = 0; i < coleccion1.size(); i++) {
			System.out.println(coleccion1.get(i));
			
		ArrayList <String> coleccion2 = new ArrayList<String>();
		coleccion1.add("colecciones");
		coleccion1.add("cohorte");
		
		System.out.println(coleccion2);
		}

	}

}
