let hora = Number(prompt("Indica la hora: "))

if (hora>= 6 && hora <= 11){
    document.write("buenos dias ");
}else if(hora>= 12 && hora<=23){
    document.write("buenas tardes");
}else if(hora>= 19 && hora <=23){
    document.write("Buenas noches ");
}else if(hora>=0 && hora <=5){
    document.write("dejame dormir");
}else{
    document.write("hora invalida");
}