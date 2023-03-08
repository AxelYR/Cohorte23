package com.gen.ayrh.mains;

import com.gen.ayrh.clases.AreaPerimetro;
import com.gen.ayrh.clases.FigurasGeometricas;

public class TestAreaPerimetro {
	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCirculo(5));
		System.out.println("Area circulo----> "+fg.getArea());
		
		fg.setPerimetro(ap.perimetroCirculo(5));
		
		System.out.println("Perimetro del circulo -->"+fg.getPerimetro());
		
	}
}
