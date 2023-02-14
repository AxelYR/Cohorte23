let mivariable = 5;
//let array = [1,2,3,4]; como prototipo

//let NewArray = new Array(); como objeto

let array= [1,2,3,4,];

console.log("arrar"+array[0]);
console.log("arrar"+array[1]);


let matriz = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

console.log("mi matiz 1", matriz[0][1]);
console.log("mi matiz 1", matriz[0][2]);

console.log("todo el indice 0", matriz[0]);

/*---------------for---------------*/

for(let i=0; i < 10; i++){
    console.log("imprimiendo i ->"+ i);
}

let matriz2 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

for(let i=0; i<3; i++){
    for(let j=0; j<3; j++){
        console.log("imprimiendo matriz2 ->"+matriz2[i][j])
    }
}

/*-----------while--------------- */

let contador =0;

while(contador<10){
    console.log("contador = ", contador);
    contador++;
}

let clave=""

