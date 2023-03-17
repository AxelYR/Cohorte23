let intentos = [];
let numeroSecreto =12//Math.floor(Math.random() * 100) + 1;

console.log(numeroSecreto)

let input = prompt("Intenta adivinar el número secreto (1-100): ")

let numero= Number(input);

while (isNaN(numero)){
    input = prompt("Por favor introduzca un valor valido: ");
    numero=Number(input);
}

while(numero!=numeroSecreto){
    alert("Número incorrecto, vuelve a intentar")
    intentos.push(numero)
    input = prompt("Intenta adivinar el número secreto (1-100): ")
    numero= Number(input);
    while (isNaN(numero)){
        input = prompt("Por favor introduzca un valor valido: ");
        numero=Number(input);
    }
}

let win = document.getElementById("resultado")
win.innerHTML = "Felicidades, adivinaste el número secreto \n" + intentos 




