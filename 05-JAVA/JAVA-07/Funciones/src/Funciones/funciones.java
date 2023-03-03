package Funciones;

public class funciones {
	
	//Las funciones se pueden decclarar en cualquier lugar dentro de la clase
	public static int sumar (int num1, int num2) {
		int resultado = num1 +num2;
		return resultado;
	}
	//cierre de sumar
	
	public static float sumardecimal (double d, double e) {
		return (float) (d+e);
	}
	//cierre de sumar decimal
	
	public static int restar (int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	//cierre de restar
	
	public static int multi (int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	//cierre de multi
	
	public static int divi (int num1, int num2) {
		int resultado = num1/num2;
		return resultado;
	}
	//cierre de divi
	
	
	public static void imprimirAsteriscos() {
		System.out.println("*****************************");
	}
	//cierre de imprimir asteriscos
	
	public static String awaDeLimon( String ingrediente, String ingrediente2, String ingrediente3){
		String recetaCompletada = ingrediente+ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	public static float torre(float distancia) {
		float angulo1= (float) 30.0;
		float angulo2= (float) 90.0;
		float angulo3= (float) 180.0-(angulo1+angulo2);
		
		

		
		float altura=(float)2;
				
		return altura;
		
	}
	
	//final funcion awaDeLimon
	//tipo voidd
	public static void main (String[] args) {
		//las invocaciones de la funcion se hacen generalmente dentro
		//del metodo principal o main
		
		System.out.println("El resultado de la suma es " + sumardecimal(2.4,5.231));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los ingredientes para hacer agua de limon: " + awaDeLimon("Agua ","Limon ","Azucar"));
	
		System.out.println("El seno de mi valor es "+ Math.sin(3.1416));
		
		System.out.println("La potencia de mi valor es "+ Math.pow(3,4));
	}
	//cierre del metodo principal

}
//cierre de clase funciones


/*
 
 Funciones
 
  -No retornan valores: no devuelven, ni especifican nada 
  y no usamos la palabra return
  
  -Si retornan valores: Se especifica el tipo de dato, el tipo de
  valor que regresa y se usa return par esto
  
*/