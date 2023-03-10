package com.ayrh.testers;

import com.ayrh.clases.AlumnoB;
import com.ayrh.clases.PersonaP;

public class TestPB {
	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123, 8.3, "Armando Casas", 16);
		PersonaP b= new PersonaP("Jorge Cuevas", 18);
		
		System.out.println(a.getNombre());
		System.out.println(a.toString());
		
		System.out.println(b.getNombre());
		a.mostrarDatos("Checo");
	}
}
