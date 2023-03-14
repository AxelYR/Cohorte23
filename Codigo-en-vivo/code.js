let bigWords = "bocina"

const myArray= ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio','botella','gato','mecanico','guitarra','final']

const nuevoArreglo= []

for (let index = 0; index < myArray.length; index++) {
    if (myArray[index].length>bigWords.length){
        nuevoArreglo.push(myArray[index])
    }
    
}

console.log(nuevoArreglo)



function recibeArray(arreglo=[]){


    for (let index = 0; index < arreglo.length; index++) {
        const liElement = document.getElementById(index + 1); // sumar 1 al índice del arreglo
        liElement.innerHTML = arreglo[index];

    }
}

recibeArray(nuevoArreglo)