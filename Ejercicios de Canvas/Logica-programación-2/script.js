let input = prompt("Ingrese una temperatura en grados Celsius: ");

let celsius= Number(input);

while (isNaN(celsius)){
    input = prompt("Por favor introduzca un valor valido: ");
    celsius = Number(input);
}

let fahrenheit = celsius * 1.8 + 32;

let kelvin = celsius + 273.15;

let conversion1 = document.getElementById("Fahrenheit");
conversion1.innerHTML= "Grados Fahrenheit: "+ fahrenheit;

let conversion2 = document.getElementById("Kelvin");
conversion2.innerHTML= "Grados Kelvin: " + kelvin;