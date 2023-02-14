// Part 1
// There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. Create an array that has these three names in order.

const nombres=["Sofia", "David", "Juan"];

console.log(nombres);

// Part 2
// Two more people get added to the back of the line - Sara and Augustin. The first person in line is called to the teller. What does the queue look like?


nombres.shift();
nombres.push("Sara","Agustin");

console.log(nombres);


// Part 3
// It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. One more person (Elena) shows up and goes to the end of the line. What does the queue look like?

nombres.splice(1,0,"Renata");
nombres.push("Elena");

console.log(nombres);

// Exercise #2
// Write a JavaScript program to construct the following pattern, using a nested for loop.

//peligro//
let piramide="* "

while(piramide!="* * * * * * "){
    console.log(piramide);
    piramide=piramide+"* ";
}
//peligro//

for(let i = 1; i <= 6; ++i) {
    let resultado = " ";

    for(let j = 1; j <= i; ++j) {
        resultado += '* ';
    }

    console.log(resultado);
}


// Exercise #3
// Write while loops to do the following:
// – Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time,
// as long as xValue remains positive.

let xValue=3

while(xValue>0){
    console.log("El resultado ahora es", xValue)
    xValue=xValue-0.5
}

// - Print all the odd numbers between 1 - 100.

let yValue=100

while(yValue>0){
    if(yValue==100){
        yValue=yValue-1
    }
    console.log(yValue);
    yValue=yValue-2
}

// - Write a method with a while loop to print 1 through n in square brackets. 
// For example, if n = 6 print [1] [2] [3] [4] [5] [6]





// - Write a method with a while loop that computes the sum of first n positive integers: 
// sum = 1 + 2 + 3 + … + n
// Examples:
// n = 5 sum = 15
// n = 19 sum = 190



