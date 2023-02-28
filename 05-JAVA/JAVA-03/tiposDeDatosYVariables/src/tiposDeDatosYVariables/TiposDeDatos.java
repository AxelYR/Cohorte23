package tiposDeDatosYVariables;

public class TiposDeDatos {

    public static void main(String[] args) {
    


        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacion = horasTrabajadas * pago;
        System.out.println(multiplicacion);
        
        double num = 1.61;
        System.out.println(num);
        
        int numInt = (int)num;
        System.out.println(numInt);
        
        long numLong = (long)num;
        System.out.println(numLong);
        
        
        String cantidad = "15";
        String precio = "115.2";
        		
        int canEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es " + (canEntero * precioDouble));
        
        
        int edad = 30;
        double estatura = 1.61;
         

        String edadStrin = String.valueOf(edad);
        String estaturaStrin = String.valueOf(estatura); 
        

        System.out.println("Edad:  "+ edadStrin + estatura + estaturaStrin);

        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        byte num1 = 3;
        byte num2 = 2;
        byte num3 = 2;
        byte num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
        
        
        int guan = 2;
        int tu = 3;
        int tri = 1;
        System.out.println("multi: "+(guan*tu)+" modu: "+(tri%tu));
        
        boolean b1=true;
        boolean b2=false;
        
        System.out.println(b1==b2);
        
        double d1 = 3.14;
        double d2 = 2.71;
        
        System.out.println(d1<d2);
        
        double fahrenheit= 36.5;
        double celsius = (fahrenheit -32) *5/9;//(32 °F − 32) × 5/9
        double kelvin = (fahrenheit -32)*5/9 + 273.15;

        System.out.println("fahrenheit a celsius es " + celsius);

        System.out.println("farenheit a kelvin es " + kelvin);


        byte elPepe = 4;
        
        if (elPepe%2==0) {
        	System.out.println("El número es par plebe");
        }else {
        	System.out.println("El número es impar ajua");
        }

    }
    

}