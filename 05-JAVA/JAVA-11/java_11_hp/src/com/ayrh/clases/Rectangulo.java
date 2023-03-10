package com.ayrh.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;
	
	
	public Rectangulo(double base, double altura) {
		super("rectangulo");
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base*altura);
	}
	
	@Override
	public void pedirDatos() {
		Scanner datos = new Scanner (System.in);
		
		System.out.println("Introduzca la base ");
		
		int b = datos.nextInt();
		setBase(b);
		
		System.out.println("Introduzca la altura ");
		
		setAltura(datos.nextInt());
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
