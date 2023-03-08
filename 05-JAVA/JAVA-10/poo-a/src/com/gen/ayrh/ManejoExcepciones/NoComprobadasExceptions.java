package com.gen.ayrh.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new  Scanner(System.in);
		System.out.println("Introduxca un valor");
		int divisor;
		

		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/0;
			System.out.println("----->"+ division);
		}catch (ArithmeticException e) {
			System.out.println("capturando la excepcion "+ e.getMessage());
		}catch(NumberFormatException r) {
			System.out.println("El dato no es valido "+ r.getLocalizedMessage());
		}finally {
			System.out.println("Este bloque es opcional yse va a ejecutar con o sin la exception");
		}
		
		System.out.println("Continuamos con el flujo de la aplicación");
	}
}
