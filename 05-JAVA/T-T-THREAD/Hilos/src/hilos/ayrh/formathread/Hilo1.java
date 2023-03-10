package hilos.ayrh.formathread;

import java.util.Iterator;

public class Hilo1 extends Thread {

	public Hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inicia el Hilo "+this.getName());
		
		for(int i = 0 ; i < 10 ; i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Termina el Hilo "+this.getName());
	}

	
}
