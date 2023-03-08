package com.gen.ayrh.mains;

import com.gen.ayrh.clases.Tacos;
import com.gen.ayrh.clases.Taquero;

public class TestTacos {
	public static void main(String[] args) {
		Tacos t = new Tacos();
		Taquero taq = new Taquero();
		
		

		t.setTacos("Maiz", "Frijoles", 2, "Mediana");
		t.setPrecio(12);
		
		System.out.println(taq.preparar(t.getTipoDeTortilla(), t.getGuisado(), t.getNumeroDeTortilla(), t.getTamanioDeTortilla())+taq.ponerSalsa());
		System.out.println(taq.vender(taq.subirPrecio(t.getPrecio()),t.getNumeroDeTortilla()));
		
		t.setTacos("Harina", "pollo", 3, "Grande");
		t.setPrecio(12);
		
		System.out.println(taq.preparar(t.getTipoDeTortilla(), t.getGuisado(), t.getNumeroDeTortilla(), t.getTamanioDeTortilla())+taq.ponerSalsa());
		System.out.println(taq.vender(t.getPrecio(),t.getNumeroDeTortilla()));
		
		
	}
}
