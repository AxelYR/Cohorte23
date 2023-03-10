package hilos.ayrh.pruebas;

import hilos.ayrh.formathread.Hilo1;

public class testThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h = new Hilo1("Juan");
		h.start();
		Thread h1 = new Hilo1("Marias");
		h1.start();
		Thread h2 = new Hilo1("Raul");
		h2.start();


		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(h.getState());
		System.out.println(h1.getState());
		System.out.println(h2.getState());

	}

}
