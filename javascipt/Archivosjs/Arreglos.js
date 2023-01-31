let mivariable= 34;
let miarreglo= []; //declaracion literal
let miarreglo01= new Array(); //declaracion por instancia

let miarreglo02= [31,32,33,34];
console.log("dato de mi arreglo en el indice 0 ", miarreglo02[0]);
console.log("dato de mi arreglo en el indice 1 ", miarreglo02[1]);
console.log("dato de mi arreglo en el indice 2 ", miarreglo02[2]);
console.log("dato de mi arreglo en el indice 3 ", miarreglo02[3]);
console.log("El tamaño o numero de elementos del arreglo02 es: ",miarreglo02.length)

let miarreglo03= ["Hola", "que", "tal"];
console.log (miarreglo03[0]);
console.log("El tamaño o numero de elementos del arreglo03 es: ",miarreglo03.length)


let miarreglo04 = [{nombre:"Hugo"},{apellido:"Fernandez"}, {edad: 23}];
console.log("El primer elemento del arreglo de tipo objeto", miarreglo04[0].nombre);
console.log("El segundo elemento del arreglo de tipo objeto", miarreglo04[1].apellido);
console.log("El tercer elemento del arreglo de tipo objeto", miarreglo04[2].edad);
console.log("El tamaño o numero de elementos del arreglo04 es: ",miarreglo04.length);

let nuevoArreglo00= [3,6,1,4];
console.log("orden de mi arregloNuevo con sort "+ nuevoArreglo00.sort());
console.log("orden de mi arregloNuevo con pop"+ nuevoArreglo00.pop());
console.log("orden de mi arregloNuevo ", nuevoArreglo00.push(10));
console.log("orden de mi arregloNuevo metodo reverse", nuevoArreglo00.reverse());

let matriz= [[1,2,3],["a","b","c"]]
console.log("tamaño "+ matriz.length)
console.log(matriz[1][1])