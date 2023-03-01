package ciclosforwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);
	public void cicloW(){
		System.out.println("Ciclo while");
		int iterador = 0;
		
		while(iterador < 10) {
			
			System.out.println("Iterador "+iterador);
			iterador = iterador +1;
			
		}
	}
	public void centinelaW() {
		System.out.println("Ciclo while Centinela");
		final int centinela =-1;
		System.out.println("Introduzca una nota");
		int nota = entrada.nextInt();
		while(nota != centinela) {
			System.out.println("Introduzca una nota");
			nota = entrada.nextInt();
			System.out.println("La nota es: " + nota);
		}
		System.out.println("Ya me voy señores, se acabo este baile");
	}
	
	public void banderaW() {
		System.out.println("Ciclo While Bandera");
		boolean valorb = false;
		while(!valorb) {
			System.out.println("Introduzca un valor númerico");
			int valorx = entrada.nextInt();
			if(valorx > 0 && valorx <= 5) {
				int potaxio = (int)Math.pow(valorx, 2);
				System.out.println("El resultado es " + potaxio);
			}else {
				valorb = true;
				System.out.println("Adios");
			}
			
		}
		
		//System.out.println("Hola soy el metodo estatico");
		//Math.pow(2, 2);
		//return 0.0;
	}
}
