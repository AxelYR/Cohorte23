package tiposDeDatosYVariables;

public class java4 {
    public static void main(String[] args) {

	int edad = 18;
	boolean tieneLicencia =false;
	if (edad >= 18 && tieneLicencia){
	    System.out.println("Puede conducir un coche");
	} else {
	    System.out.println("No puede conducir un coche");
	}
	String nombre = "Juan";
	String apellido = "Pérez";
	if (nombre.equals("Juan") || apellido.equals("Pérez")) {
	    System.out.println("El usuario es Juan Pérez");
	} else {
	    System.out.println("El usuario no es Juan Pérez");
	}
	boolean esVerdadero = true;
	if (!esVerdadero) {
	    System.out.println("La condición es falsa");
	} else {
	    System.out.println("La condición es verdadera");
	}
	
	
	//Verificar si un número es par y positivo:
	int num = 36;
	
	System.out.println(num%2==0 && num>0);


		//Verificar si un número está dentro de un rango específico
	int canum = 10;
	
	System.out.println(canum<-2||2<canum); 
	

		//Verificar si una cadena es igual a otra o no
	String cadena1 = "Hola";
	String cadena2 = "hola";
	
	System.out.println(cadena1==cadena2);

}
}
