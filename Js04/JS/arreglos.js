let lista=[12,5,80,34];
//console.log(lista.length)

let msj = lista.join("-");
console.log(msj);


lista.push(100);
console.log(lista);

let listanueva=lista.slice(1,3)
console.log(listanueva);

for(let i =0; i<lista.length; i++){
    console.log(lista[i]);    
}
console.log(lista);