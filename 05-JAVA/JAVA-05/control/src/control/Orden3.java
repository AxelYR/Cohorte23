package control;

import java.util.Scanner;

public class Orden3{
	Scanner dato = new Scanner(System.in);
	
	public void problema(){
		int nota = dato.nextInt();
		int nota2 = dato.nextInt();
		int nota3 = dato.nextInt();
		
		if (nota >= nota2 && nota >= nota3) {
			System.out.println(nota);
			if(nota2>=nota3) {
				System.out.println(nota3);
				System.out.println(nota2);
				}else {
					System.out.println(nota2);
					System.out.println(nota3);
				}
		}else if (nota2>=nota && nota2>=nota3) {
			System.out.println(nota2);
			if(nota>=nota3) {
				System.out.println(nota);
				System.out.println(nota3);
			}else {
				System.out.println(nota3);
				System.out.println(nota);
			}
		}else if (nota3>=nota && nota3>=nota2) {
			System.out.println(nota3);
			if(nota>=nota2) {
				System.out.println(nota);
				System.out.println(nota2);
			}else {
				System.out.println(nota2);
				System.out.println(nota);
			}
		}

	}
}
