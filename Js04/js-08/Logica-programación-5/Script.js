let numeroAleatorio = Math.floor(Math.random() * 100) + 1;

var adivinado = false;

let IntentosF= " "

while (adivinado == false) {
  
  let numeroI = prompt(
    "Intenta adivinar el número secreto ingresando un número"
  );

  if (isNaN(numeroI)) {
    alert("El valor introducido no es un número.");
  } else if (numeroAleatorio > numeroI) {
    alert("Ups, el número secreto es mayor, vuelve a intentarlo");
    IntentosF=IntentosF+"-"+numeroI
  } else if (numeroAleatorio < numeroI) {
    alert("Ups, el número secreto es menor, vuelve a intentarlo");
    IntentosF=IntentosF+"-"+numeroI
  } else{
    alert("Adivinaste el número secreto! "+ numeroI); 
    document.querySelector("#intentos").textContent = "Intentos fallidos: " + IntentosF;
    var adivinado = true;
  }
}


