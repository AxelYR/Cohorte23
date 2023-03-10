package com.ayrh.testers;

import com.ayrh.clases.Circulo;
import com.ayrh.clases.Cuadrado;
import com.ayrh.clases.FigurasGeometricas;
import com.ayrh.clases.Rectangulo;
import com.ayrh.clases.Triangulo;

public class TestFigurasGeometricas {
	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(2, 4);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas cuadrado = new Cuadrado(4);
		FigurasGeometricas triangulo = new Triangulo(5, 9);
		
		//System.out.println(rectangulo.toString());
		circulo.pedirDatos();
		System.out.println(circulo.toString());
		//System.out.println(cuadrado.areas());
		//triangulo.pedirDatos();
		//System.out.println(triangulo.areas());
	}
}
