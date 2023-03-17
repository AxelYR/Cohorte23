let n=prompt("Ingrese el primer numero");
let n1= Number(n);
n=prompt("Ingrese el segundo numero");
let n2 = Number(n);
n=prompt("Ingrese el tercer numero");
let n3 = Number(n);

const numeros= [n1,n2,n3];

if(n1==n2 && n1==n3){
    let mensaje = document.getElementById("mensaje")
    mensaje.innerHTML = "Los números son iguales"
}else{

numeros.sort((a,b)=> a-b)

let resultado1 = document.getElementById("resultado");
resultado1.innerHTML= "Orden Ascendente: "+numeros;

numeros.sort((a,b)=> b-a)

let resultado2 = document.getElementById("resultado2");
resultado2.innerHTML= "Orden Descendente: "+numeros;
}
