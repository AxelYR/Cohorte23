package testers;

import oop.clases.Persona;

public class testPersona {
	public static void main(String[]args) {
		//Persona p = new Persona("juan", 0, null);
		//System.out.println(p.nombre);
		//p.setNombre("Maria");
		//System.out.println(">>>>"+p.getNombre());
		
		Persona p1 = new Persona("Tata", 90, 1.85, 83.3, "Sagitario");
		
		System.out.println(p1.datosPersona());
	}
}
