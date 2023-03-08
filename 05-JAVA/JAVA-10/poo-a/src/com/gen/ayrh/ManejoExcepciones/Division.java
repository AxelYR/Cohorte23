package com.gen.ayrh.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	public Division(int numerador, int denominador) throws OpExceptions {
		
		if (denominador == 0) {
			throw new OpExceptions("el denominador es un cerote");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	} 
		public void visualizarD (String msj) {
			
			System.out.println("el resultado de la division es " + (this.numerador/this.denominador));
		}
	
}
