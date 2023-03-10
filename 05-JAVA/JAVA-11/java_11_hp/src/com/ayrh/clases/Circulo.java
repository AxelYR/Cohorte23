package com.ayrh.clases;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas {
	private int radio; 
	
	
	public Circulo(int radio) {
		super("Circulo");
		this.radio = radio;
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	@Override
	public double areas() {
		
		return Math.PI*Math.pow(radio, radio);
	}


	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner (System.in);
		System.out.println("Introduzca el radio ");
		
		setRadio(datos.nextInt());
	}

}
