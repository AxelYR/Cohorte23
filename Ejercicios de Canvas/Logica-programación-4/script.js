let input = prompt("Ingrese un número para obtener su factorial")

let numero= Number(input);

while (isNaN(numero)){
    input = prompt("Por favor introduzca un valor valido: ");
    numero = Number(input);
}


const fibo= []

for (let index = 0; index < numero; index++) {
    if (index<2){
        fibo.push(index)
    }else{
        fibo.push(fibo[index-2]+fibo[index-1])
    }
}

let resultado = document.getElementById("resultado");
resultado.innerHTML = fibo