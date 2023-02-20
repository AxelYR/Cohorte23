let persona = {
    nombre :"Juan",
    apellido: "Perez",
    nombreCompleto: function(){
        return `El nombre es `+this.nombre+` `+this.apellido;
    }
}
console.log(persona.nombreCompleto());