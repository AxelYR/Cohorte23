package com.ayrh.clases;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas {
	private double lado; 
	
	
	
	public Cuadrado(double lado) {
		super("cuadrado");
		this.lado = lado;
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return lado*lado;
	}



	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner (System.in);
		
		System.out.println("Introduzca el lado ");
		
		setLado(datos.nextInt());
	}
	
}
