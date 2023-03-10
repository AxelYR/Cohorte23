package com.ayrh.clases;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas{
	private int base;
	private int altura;
	
	
	
	public Triangulo(int base, int altura) {
		super("triangulo");
		this.base = base;
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
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


	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
}
