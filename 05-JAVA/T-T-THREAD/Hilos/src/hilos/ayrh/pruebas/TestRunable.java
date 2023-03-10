package hilos.ayrh.pruebas;

import gilos.ayrh.formarunable.Hilo2;

public class TestRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 ht = new Hilo2("");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread (new Hilo2("Canicula"));
		new Thread (new Hilo2("Mariano"));

	}

}
