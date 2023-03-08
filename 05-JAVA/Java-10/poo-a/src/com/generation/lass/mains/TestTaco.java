package com.generation.lass.mains;

import com.generation.lass.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taco taco1 = new Taco("maiz", "chicharron", 4, "medianas", 10);
		System.out.println(taco1.preparar(taco1.getNumeroDeTortilla()));
		System.out.println(taco1.ponerSalsa(true));
		System.out.println(taco1.vender(taco1.getPrecio(), taco1.getNumeroDeTortilla()));
		System.out.println(taco1.toString());		
		taco1.subirPrecio(2);
		System.out.println(taco1.preparar(taco1.getNumeroDeTortilla()));
		System.out.println(taco1.ponerSalsa(true));
		System.out.println(taco1.vender(taco1.getPrecio(), taco1.getNumeroDeTortilla()));
		System.out.println(taco1.toString());
	}

}
