division(14,5)

//Para pensar a futuro
//agregar_carrito_de_compra();
//borrar_carrito();
//agregar_producto();
//pagar();

//funciones

function suma(a,b) {
    let sum1 = a + b
    console.log(sum1)
}

//hoisting
//console.log(edad);
    //let edad= "20";

//Por que son importantes las funciones?
//- Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
//- Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
//- Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
//- Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)


//Cosas importantes a tener en cuenta para crear funciones
//- Nombre que sea descriptivo y evoque al funcionamiento de ese bloque de codigo
//- Datos de entrada (parametro)
//- Procesos o instruccciones a ejecutar 
//- Salida (return)
//

//funcion directa
function agregar_carrito(){
    //lo que hace la funcion;
}

//invocar funcion
agregar_carrito();

//funcion anonima 

let funcion_anonima = function(){
    let valor1=5;
    let valor2=7;
    let suma= valor1+valor2
    console.log("Esta funcion anonima: ", suma)
}

funcion_anonima();

function division (parametro1, parametro2){
    let resultado= parametro1/parametro2;
    console.log(resultado)

}

division(88,10);

/*
Tipos de funciones

    funciones directas - nombre (comunes)
    funciones anonimas viven pegadas a una variable o constante
    funciones con metodos (para especificar que hace mi objeto)
    funciones como constructores(para construir o crear un objeto)

*/


//funcion flecha
const suma =(a, b) => a+b;

console.log(suma);

//funcion flecha con mas lineas de codigo

const sumar_y_multiplicar = (a,b) => {
    const sum = a+b;
    const result = sum*2;
    return result;

}

/* 


*/

function area_cuadrado(){
    let lado= 5;
    let area = lado * lado;
    console.log("el area de mi cuadrado es ", area)
    return area;
}

area_cuadrado();

let resultado_de_funcion = area_cuadrado();

console.log("el resultado de mi funcion cuadrado es: ", resultado_de_funcion);