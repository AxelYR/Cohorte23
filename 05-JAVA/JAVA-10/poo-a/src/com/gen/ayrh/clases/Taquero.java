package com.gen.ayrh.clases;

public class Taquero {
	
	
	public Taquero() {
		
	}
	
	public String preparar(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla) {
			
		String tacomun="Va a llevar un taco con tortilla de "+tipoDeTortilla+" va a ser de "+guisado+ " en "+numeroDeTortilla+ " tortilla/s "+tamanioDeTortilla+"s";
			
		return tacomun;
	}
	public String vender(double precio, int tortillas) {
		
		String cobro = "van a ser "+ precio*tortillas + " pesos";
		
		return cobro;
	}
	
	public  String ponerSalsa() {
		
		return " Con Salsa";
	}
	
	public double subirPrecio(double precio) {
		
		
		return precio+50;
	}
	
	
}
