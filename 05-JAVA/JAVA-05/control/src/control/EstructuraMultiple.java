package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);
	
	public void vocal() {
		System.out.println("Introduzca una letra wahahahaha ");
		char letra = dato.next().charAt(0);
		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(" es vocal");
			break;
		default:			
			System.out.println(" no es vocal");
			break;
		}
	}
	public void notas() {
		System.out.println("Introduzca una calificación: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("Reprobado");
			break;
		case 6:System.out.println("Deficiente");
			break;
		case 7:System.out.println("Regular");
			break;
		case 8:System.out.println("Bueno");
			break;
		case 9:System.out.println("Muy bueno");
			break;
		case 10:System.out.println("Excelente");
			break;

		default:
			System.out.println("Fuera de rango");
			break;
		}
	}
	public void elbistek() {
		System.out.println("Introduzca un primer nombre ");
		String entradaV = dato.nextLine();
		System.out.println("Introduzca un segundo nombre ");
		String entradaV2 = dato.nextLine();
		
		String x = (entradaV.equals(entradaV2)) ? "Son el mismo nombre": "no son el mismo nombre";
		
		System.out.println(x);

	}
}
