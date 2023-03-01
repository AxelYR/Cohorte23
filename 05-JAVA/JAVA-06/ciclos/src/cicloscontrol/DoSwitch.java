package cicloscontrol;

import java.util.Scanner;

import ciclosforwhiledo.CicloDo;
import ciclosforwhiledo.UsoFor;
import ciclosforwhiledo.UsoWhile;

public class DoSwitch {
	Scanner s = new Scanner(System.in);
	public void controlador() {
		int opcion= 0;
		Menus mp = new Menus();
		UsoWhile uw = new UsoWhile();
		UsoFor uf = new UsoFor();
		CicloDo cd = new CicloDo();
		do {
			mp.menuPrincipal();
			System.out.println("Introduzca un op: ");
			opcion = s.nextInt();
			switch (opcion) {
			case 1: 
				uw.cicloW();
				break;
			case 2:
				uw.centinelaW();
				break;
			case 3:
				uw.banderaW();
				break;
			case 4:
				uf.cicloFor();
				break;
			case 5:
				uf.letrasfor();
				break;
			case 6:
				cd.digitosDo();
				break;
				
			default:
				System.out.println("Fuimonos");
				break;
			}
		}while(opcion > 0 && opcion < 7);
	}

}
