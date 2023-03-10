package com.ayrh.testers;

import com.ayrh.clases.Mensajes;
import com.ayrh.clases.OperacionesAritmeticas;
import com.ayrh.clases.*;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5,2);
		
		OperacionesAritmeticas ss = new Suma(10,3);
		
		OperacionesAritmeticas rr = new Resta(10,3);
		
		OperacionesAritmeticas dd = new Division(10,3);
		
		OperacionesAritmeticas mm = new Multiplicacion(10,3);
		
		
		
		Mensajes sss = new Suma(11,2);
		
		System.out.println(s.sumar());
		
		s.mensaje();
		
		sss.mensaje();
		
		System.out.println(ss.sumar());
		System.out.println(rr.restar());
		System.out.println(dd.dividir());
		System.out.println(mm.multiplicar());

		
		
	}

}
