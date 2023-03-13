package pruebasIunit.ayrh.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pruebasIunit.ayrh.app.Calculadora;

class CalculadoraTest {
	
	private Calculadora ct;

	
	//@BeforeEach
	//public void configurandoBefore() {
	//	ct = new Calculadora();
	//	System.out.println("Ejecutando Before >>>>> configurandoBefore()");
	//}
	
	//@AfterEach
	//public void configurandoAfter() {
	//	ct=null;
	//	System.out.println("Ejecutando AfterEach () >>>>> ConfiguracionAfter");
	//}
	
	//@Test
	//public void calculadoraNull() {
		//assertNull(ct,"La clase es una instancia no nula");
	//	System.out.println("Ejecutando primer test >>> calculadora");
//	}
	
	//@Test
	//public void CalculadoraNoNull() {

		//assertNotNull(ct,"La calse es una instancia nula");
	//System.out.println("bien");	}
	
//Puebas
	
	/*
	public void primerosAssert() {
		//1.-indicar lo que se va a evaluar
		//2.-indicar lo que se va a realizar 
		//3.-Evaluar con Assert indicado
		
		int resultadoEsperado = 10 ; 
		int resultadoActual; 
		resultadoActual = ct.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test >>>> primerosAssert");
	}
	
	*/
	
	/*
	@Test
	private void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10,10));
		System.out.println("Ejecutando Cuarto Test");
	}
	*/
	
	
	//Tipos de Test
	
	/*@Test
	public void tiposAsserts() {
		assertNull(ct);
		assertTrue(1==2-1);
		assertEquals("Generation", "Generation");
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();
		//assertSame(c2, c3);
		assertNotSame(c2, c3);
		
	}*/
	
	@Test
	private void validandoSuma() {
		// TODO Auto-generated method stub
		assertEquals(11, ct.sumar(5, 6));
	}
	@Test
	private void validandoResta() {
		// TODO Auto-generated method stub
		assertEquals(50, ct.restar(56, 6));
	}
	@Test
	private void validandoDivision() {
		// TODO Auto-generated method stub
		assertEquals(2, ct.division(10, 5));
	}
}
