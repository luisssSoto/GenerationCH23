package com.generation.lass.mains;
import com.generation.lass.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(5);
		ClaseGenerica<String> strObj = new ClaseGenerica<String>("hello");
		
		
		intObj.claseTipo();
		strObj.claseTipo();
	}

}
