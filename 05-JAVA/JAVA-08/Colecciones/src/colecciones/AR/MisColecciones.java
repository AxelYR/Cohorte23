package colecciones.AR;

import java.util.*;

public class MisColecciones {
	
	
	
	public static void main(String[] args) {
		
		wrapperClass();
		
	}
	
	public void listas() {
		List miLista = new ArrayList();
		
	}
	
	
	
	static void wrapperClass() {
		
		byte numeroB = 12;
		System.out.println("El tamaño de un bait "+ Byte.SIZE);
		System.out.println("Valor maximo " + Byte.MAX_VALUE);
		System.out.println("Valor minimo " + Byte.MIN_VALUE);
		System.out.println("---->" + numeroB);
		
		int numeroE = 128;
		
		System.out.println("El tamaño de un entero "+ Integer.SIZE);
		System.out.println("Valor maximo "+ Integer.MAX_VALUE);
		System.out.println("Valor Minimo " + Integer.MIN_VALUE);
		
		short numeroS=12;
		
		System.out.println("El tamaño de un short "+ Short.SIZE);
		System.out.println("Valor maximo "+ Short.MAX_VALUE);
		System.out.println("Valor Minimo " + Short.MIN_VALUE);
		
		double numeroD=12; 
		System.out.println("El tamaño de un double "+ Double.SIZE);
		System.out.println("Valor maximo "+ Double.MAX_VALUE);
		System.out.println("Valor Minimo " + Double.MIN_VALUE);
		
		float numeroF=12;
		System.out.println("El tamaño de un float "+ Float.SIZE);
		System.out.println("Valor maximo "+ Float.MAX_VALUE);
		System.out.println("Valor Minimo " + Float.MIN_VALUE);
		
		long numeroL=12;
		System.out.println("El tamaño de un long "+ Long.SIZE);
		System.out.println("Valor maximo "+ Long.MAX_VALUE);
		System.out.println("Valor Minimo " + Long.MIN_VALUE);
		
		
	}
}
