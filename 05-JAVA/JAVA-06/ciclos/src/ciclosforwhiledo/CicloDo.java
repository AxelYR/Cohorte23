package ciclosforwhiledo;

import java.util.Scanner;

public class CicloDo {
	Scanner dato = new Scanner(System.in);
	public void digitosDo() {
		
		System.out.println("Ciclo While do");
		
		int valor = 0;
		int acumulador= 0;
		
		do {
			System.out.println("Introduzca un digito entre 0 y 9");
			valor= dato.nextInt();
			acumulador = acumulador + valor;
			System.out.println("--> " + acumulador);
		}while(valor>=0 && valor<10);
		System.out.println("bye");
	}
}
