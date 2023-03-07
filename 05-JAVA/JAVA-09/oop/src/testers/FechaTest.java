package testers;

import oop.clases.fecha;

public class FechaTest {
	public static void main(String[]args) {
		fecha f1 = new fecha(06, "Marzo", 2023);
		
		System.out.println(f1.dia+" de "+ f1.mes+ " del "+ f1.año);
		
		System.out.println(f1.fechota());
	}
}
