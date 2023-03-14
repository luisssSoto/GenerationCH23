package pruebasJUnit.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pruebasJUnit.lass.app.Calculadora;

class CalculadoraTest {
	
	private Calculadora calculadora1;
	private Calculadora calculadora2;
	
	@BeforeEach
	public void configurandoBefore() {
		calculadora1 = new Calculadora();
		System.out.println("Ejecutando Before ---> configurandoBefore()");
	}
	@AfterEach
	private void configurandoAfter() {
		// TODO Auto-generated method stub
		calculadora1 = null;
		System.out.println("Ejecutando AfterEach ----->");
	}
	@Test
	public void calculadoraTest() {
		assertNotNull(calculadora1);
		System.out.println("ejecutando primer test ---> calculadora");
	}
	@Test
	public void calculadoraNotNull() {
		assertNull(calculadora1, "la clase esta instanciada");
		System.out.println("ejecutando segundo test ---> calculadora");
	}
	
	/*************************/
	public void primerosAssert() {
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = calculadora1.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test ----> primerosAssert");
	}
	
	public void sumarTest() {
		Calculadora calculadora3 = new Calculadora();
		assertEquals(20, calculadora3.sumar(10,10));
		System.out.println("Ejecutando cuartp test ---> primerosAssert");
	}
	
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(calculadora1);
		
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 =  c1;
		
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.2, .5);
	}
	@Test
	public void validandoSuma() {
		assertEquals(11, calculadora1.sumar(5, 6));
		
	}
	@Test
	public void validandoResta() {
		assertEquals(50, calculadora1.restar(56, 6));
	}
	@Test
	public void validandoRestaNegativa() {
		assertEquals(-10, calculadora1.restar(1, 20));
	}
	@Test
	public void validandoDivision() {
		assertEquals(2,calculadora1.division(10,5));
	}
	
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class, 
				()->calculadora1.divisionByZero(10, 0),"No se puede dividir entre cero");
	}
	
	@Disabled("En espera")
	@Test
	public void validandoByZero() {
		assertThrows(ArithmeticException.class,
				()->calculadora1.divisionByZero(10, 1), "No se puede dividir por cero");
	}
}
