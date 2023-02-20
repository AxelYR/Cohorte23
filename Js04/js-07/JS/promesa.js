const myUrl= document.URL.toString();
const promesa= fetch(myUrl);
//Manda un mensaje de que ha ocurrido un error, las promesas se pueden encadenar
promesa.then(resultado=>console.log(resultado), 
e=> console.log(`error callback ${e}`));