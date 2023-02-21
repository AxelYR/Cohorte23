//clase papah
class Fulano{
    constructor(nombre,apellido){
        this._nombre=nombre;
        this._apellido=apellido;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get nombre(){
        return this._nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get apellido(){
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre+ " "+ this._apellido;
    }
    //sobreescribir el metodo de la clase padre Object
    toString(){
        return this.nombreCompleto();
    }
}

class Chambeador extends Fulano{
    constructor(nombre,apellido,departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    //sobre escritura de metodo
    nombreCompleto(){
        return super.nombreCompleto()+ "-"+this.departamento;
    }
}

let nombre1=prompt("ingresa un nombre") 

let Fulano3000 = new Chambeador(nombre1, "Reyes", "Gerente");
console.log(Fulano3000);
console.log(Fulano3000.nombreCompleto());

let fulano200 = new Fulano("Ximena", "Andares");
console.log(fulano200.nombreCompleto());



// let Fulano3 = new Fulano("Jhonny", "Deep");

// Fulano3.nombre = "Juan";
// console.log(Fulano3.nombre)

// Fulano3.apellido = "Gutierritoz"
// console.log(Fulano3.apellido)

//-------------------------------------------//

// let Fulano1 = new Fulano("Juan", "Perez");
// console.log(Fulano1);

// let Fulano2 = new Fulano("Maria", "Jimenez");
// console.log(Fulano2);