let input = prompt("Ingrese un número para obtener su factorial")

let numero= Number(input);

let facto=1;

while (isNaN(numero)){
    input = prompt("Por favor introduzca un valor valido: ");
    numero = Number(input);
}

for (let index = 0; index < input; index++) {
    facto=numero*facto;
    numero=numero-1;
}

let resultado = document.getElementById("resultado");
resultado.innerHTML = facto;

