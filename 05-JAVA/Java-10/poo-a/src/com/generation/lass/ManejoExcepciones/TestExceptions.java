package com.generation.lass.ManejoExcepciones;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Division division1 =  new Division(4, 2);
			division1.visualizarD();
		} catch (OpExceptions e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("continua...");
	}

}
