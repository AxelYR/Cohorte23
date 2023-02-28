package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
		long nota = 2;
		if(nota > 5) {
			System.out.println("Ya aprobaste con " + nota);
		}else {
			System.out.println("Ya tronaste el semestre con " + nota);
		}
		
	}
	public void divisible() {
		System.out.println("Introduce un número ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca un primer número: ");
		int dato2 = entrada.nextInt();
		if (dato1%dato2==0) {
			System.out.println(dato1 + " es divisible entre "+ dato2);
		}else {
			System.out.println(dato1+ " no es divisible entre "+dato2);
		}
	}
	public void comparar() {
		System.out.println("Introduce un número ");
		int dato3 = entrada.nextInt();
		System.out.println("Introduzca un primer número: ");
		int dato4 = entrada.nextInt();
		
		if(dato3>dato4){
			System.out.println(dato3+" es mayor que " + dato4);
		}else if (dato3<dato4) {
			System.out.println(dato3+" es menor que " + dato4);
		}else {
			System.out.println(dato3+" es igual que " + dato4);

		}
	}
	public void anidado() {
		System.out.println("Introduzca un número: ");
		int datote = entrada.nextInt();
		if(datote>0){
			System.out.println(datote+ " es positivo");
		} else if(datote<0) {
			System.out.println(datote + " es negativo");

		}else {
			System.out.println("El número es cero");
		}
	}
}
