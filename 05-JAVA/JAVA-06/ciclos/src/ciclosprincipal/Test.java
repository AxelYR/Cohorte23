package ciclosprincipal;

import cicloscontrol.DoSwitch;
import ciclosforwhiledo.CicloDo;
import ciclosforwhiledo.UsoFor;
import ciclosforwhiledo.UsoWhile;

public class Test {
	public static void main(String[] args) {
		UsoWhile uw = new UsoWhile();
		UsoFor uf = new UsoFor();
		CicloDo cd = new CicloDo();
		DoSwitch ds = new DoSwitch();
		//uw.centinelaW();
		//uw.banderaW();
		//uf.letrasfor();
		//cd.digitosDo();
		ds.controlador();
	}

}
