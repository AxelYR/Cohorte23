/*

Que encontramos en el arbol del DOM?

 - Node: Es la unidad mas basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipualacion DOM //Es un nodo, pero es hijo del title
    </title>


 - Document: Tambien es un nodo, del tipo documento, es el nodo raiz a partir del cual se desarrollan o generan todos los demas nodos.

 - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

 - Attributes: Nodos que dan informacion asociada al tipo de elemento

 - Comentario: Comentarios y otros elementos que estan dentro del HTML, son considerados nodos.


Metodos tracidionales(Usados en versiones antiguas de Javascript)

    -document.getElementById
    -document.getElementByTagName
    -document.getElementByClassName

*/

// var elementoID=document.getElementById("boton_suma");
// console.log(elementoID);

// var elementoEtiqueta= document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0]);

// var elementoClassName= document.getElementsByClassName("botones");
// console.log(elementoClassName);

/*

Metodos recientes

    -document.querySelector(#botones)
    -document.querySelectorAll(.botones)

*/

// var unElemento= document.querySelector("#input1");
// console.log(unElemento);

// var variosElementos= document.querySelectorAll(".botones")
// console.log(variosElementos)

//construir nuestra calculadora

//Creación de una etiqueta del tipo imagen
const imagenPerrito = document.createElement("img");

imagenPerrito.src="https://sabrositadigital.mx/wp-content/uploads/2022/10/maxresdefault-1.jpg";
imagenPerrito.alt="foto de perrito tierno"
imagenPerrito.style.width= "150px";

var textoPerrito= document.createElement("p")
textoPerrito="Este es mi perrito"

//poner elementos en el html
document.body.append(imagenPerrito);


//actualizar nodos
//identificar el nodo que quiero cambiar (outer)
//modificar el nodo (inner)

var resultadoQueCambia = document.getElementById("resultado")

//resultadoQueCambia.innerHTML= "Saludos cambie el texto wahahahaha"

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

const boton_suma= document.getElementById("boton_suma");
const boton_resta= document.getElementById("boton_resta");
const boton_multiplicacion= document.getElementById("boton_multiplicacion");
const boton_division= document.getElementById("boton_division");

var resultado= document.getElementById("resultado");

/*
Manipulacion de DOM

    metodos para acceder a elementos

        document.getElementosByClassName

    metodos para crear elementos

        document.createElement(etiqueta)
        document.createTextNode(texto)

    metodos para insertar elementos

        parentElement.append
        parentElement.insertBefore
        parentElement.insertAdjacentElement

    metodos para modificar elementos
        node.outerHTML(Leer o referenciar el elemento)
        node.innerHTML(modificar el elemento)
*/


const textoModificar=document.querySelector("#h1");

function cambiaColor(color){
    textoModificar.style.color=color;
}

//Construimos las funciones de nuestra calculadora 

function suma(){
    let valor1= parseInt(input1.value);//pido numero 1
    let valor2= parseInt(input2.value);//pido numero 2
    let suma = valor1+valor2;//calculo la suma de ambos numeros
    resultado.innerHTML=suma;//pongo el resultado en su lugar
}

function resta(){
    let valor1= parseInt(input1.value);//pido numero 1
    let valor2= parseInt(input2.value);//pido numero 2
    let resta = valor1-valor2;//calculo la resta de ambos numeros
    resultado.innerHTML=resta;//pongo el resultado en su lugar
}

function multiplicacion(){
    let valor1= parseInt(input1.value);//pido numero 1
    let valor2= parseInt(input2.value);//pido numero 2
    let multiplicacion = valor1*valor2;//calculo la suma de ambos numeros
    resultado.innerHTML=multiplicacion;//pongo el resultado en su lugar
}

function division(){
    let valor1= parseInt(input1.value);//pido numero 1
    let valor2= parseInt(input2.value);//pido numero 2
    let division = valor1/valor2;//calculo la suma de ambos numeros
    resultado.innerHTML=division;//pongo el resultado en su lugar

}

//creacion de eventos (addEventlistener)
///node.addEventlistener("evento a escuchar"), lo que quiero que haga
//cuando se escuche

boton_suma.addEventListener("click", suma);

boton_resta.addEventListener("click", resta);

boton_multiplicacion.addEventListener("click", multiplicacion);

boton_division.addEventListener("click", division);
