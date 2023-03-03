package colecciones.AR;

import java.util.*;

public class MisCollection {
	

	
	
	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		mapCollections();
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor 1", "Juan");
		miMap.put("valor 2", "Maria");
		miMap.put("valor 3", "Felipe");
		miMap.put("valor 4", "Victor");


		imprimir(miMap.keySet());
		imprimir(miMap.values());
	}
		
	
	Set setCollections() {
		Set miSet =  new HashSet();
		
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add(-1);
		
		
		miSet.remove("tres");
		boolean bulli = miSet.contains("tres");
		System.out.println(bulli);
		
		Object a[] = miSet.toArray();
		for (int i = 0; i <a.length; i++) {
			System.out.println("Este es un set en arreglo "+ a[i]);
		}


		
		return miSet;
	}
		
	public List listaCollections() {
		List miLista = new ArrayList();
		
		System.out.println(miLista + " Tamaño de la lista antes "+ miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(0,"pato");
		
		miLista.set(0, miLista);
		
		boolean e = miLista.contains(3);

		
		//una interfaz no se puede instancear
		//si una funcion no es de tipo void, debe llevar un 

		System.out.println(miLista + "Tamaño de la lista despues "+ miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		return miLista;
		
	}
	
	private static void imprimir(Collection collection) {
		
		for (Object elementos : collection) {
			System.out.println("Elementos "+ elementos);
		}
		
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
