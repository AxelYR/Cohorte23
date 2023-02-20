class OperacionesAritmeticas{
    numero0 = 9;
    numero1 = 1;

    constructor(valor0,valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(){
        return this.numero0+this.numero1;
    }

    resta(){
        return this.numero0-this.numero1;
    }

    multi(){
        return this.numero0*this.numero1;
    }

    divi(){
        return this.numero0/this.numero1;
    }
}

let obj4= new OperacionesAritmeticas(4,88);
console.log("----->"+obj4.multi());



let obj3= new OperacionesAritmeticas();
obj3.numero0=8;
obj3.numero1=5;
console.log(obj3.sumar(obj3.numero0,obj3.numero1));


// let obt2 = new OperacionesAritmeticas();
// console.log(obt2.sumar(5,6));


let obt1;
obt1= new OperacionesAritmeticas();
let a = obt1.numero0;