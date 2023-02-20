let texto= "Hola mundo";
let mensaje="El texto tiene "+texto.length+" caracteres";
console.log(mensaje)

//-----------------------------------

let texto2= "Hola mundo";
let mensaje2=" ";

for(let index=0; index<texto2.length; index++){
    mensaje2 += texto2[index] + " ";
}
mensaje2=mensaje2.trim()

console.log(mensaje2)

//--------------------------

let texto3= "Hola mundo";
let mensaje3=texto3.toUpperCase();

console.log(mensaje3);

//--------------------------

let texto4="Hola mundo";
let palabra= texto4.substr(0,4);

console.log(palabra);

//---------------------------

let texto5= "Hola mundi"
let palabra5= texto5.substring(5,7);

console.log(palabra5);

//---------------------------

let texto6= "Hola mundo";
let palabra6= texto6.split(" ");

console.log(palabra6[0]+" / "+palabra6[1])

//------------------------------

let texto7="Hola mundo";
if (texto7.includes("Hola")) {
    console.log("Verdadero");    
}else{
    console.log("Ese caracter no esta en el texto")
}


//------------------------------
let GPAacumulativo=1;
Unidadestotales=150;

// if (GPAacumulativo>2.0){
//     if(Unidadestotales>=120){
//         console.log("¡Puede graduarse!")
//     }
// }

if (GPAacumulativo>2.0&& Unidadestotales>=120){
    console.log("¡Puede graduarse!");
}else{console.log("No puede graduarse")};

//------------------------------------

let cspCalificacion=60;
let progCalificacion=95;

// if(cspCalificacion>=75){
//     console.log("¡Eres elegible para la graduacion!")
// }
// if(progCalificacion>=75){
//     console.log("¡Eres elegible para la graduacion!")
// }

if(cspCalificacion>=75 && progCalificacion>=75){
    console.log("¡Eres elegible para la graduacion!");
}else{
    console.log("No eres elegible para la graduación");
};

//--------------------------------------

let text="Hola Mundo";
let final_text=""


// for (let i = 0; i < text.length; i++) {
//     if (text[i]!=" " && text[i+1]!=" "){ 

//         final_text=final_text+text[i]+"."  

//     }else if(text[i]==text[i-1]){

//         final_text=final_text+text[i]

//     }else if(text[i+1]==" "){

//         final_text=final_text+text[i]+" "
//     }
// }


for (let i = 0; i < text.length; i++) {
    if (i===text.length-1){ 

        final_text=final_text+text[i] 

    }else if(text[i]!=" " && text[i+1]!=" "){

        final_text=final_text+text[i]+"."
        
    }else if(text[i+1]==" "){

        final_text=final_text+text[i]+" "
    }
}

console.log(final_text)
