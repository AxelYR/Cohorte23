package ciclosforwhiledo;

public class UsoFor {
	public void cicloFor() {
		System.out.println("Ciclo for ");
		for (int i = 0; i <10; i++) {
			System.out.println("El iterador "+ i);
		}
	}
	public void letrasfor() {
		System.out.println("Ciclo For con Letras");
		for (int i = 'A'; i <='Z'; i++) {
			//System.out.print("Soy " + i + ", ");
			char letra = (char) i;
			System.out.print("Soy " + letra+ " ");
		}
	}
}
