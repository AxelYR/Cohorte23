package com.gen.ayrh.clases;

public class AreaPerimetro {

	
	public double areaCuadrado(double lado) {
		double area = lado*lado;
		
		return area;
	}
	
	public double perimetroCuadrado(double lado) {
		
		double perimetro = lado*4;
		return perimetro;
	}
	
	public double areaTriangulo(int base, int altura) {
		
		double areaTriangulo=(base*altura)/2;
		
		return areaTriangulo ;
	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC){
		
		return (ladoA+ladoB+ladoC);
	}
	
	public double areaCirculo(double radio) {
		
		
		return (radio*radio)*3.1416;
	}
	
	public double perimetroCirculo(double radio) {
		
		
		return 2*3.14159*radio;
	}
}

