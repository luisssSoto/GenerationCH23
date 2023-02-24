// Crear un programa en Javascript que realice lo siguiente:
// ○ Debe solicitar al usuario un número por prompt o por input y guardarlo.
// ○ Debe calcular el factorial del número recibido.
// ○ Debe imprimir el resultado por consola o por el DOM.
// ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
// mensaje de error y volver a solicitar el dato.
// ● Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:

let num1=parseInt(prompt("Introduce a number: "));
let factorialArray=[];
var numFactorial=1;

while(Number.isInteger(num1)===false){
    alert("Sorry but youy data is not right, only numbers please: ")
    num1=parseInt(prompt("Introduce a number: "));
}

for(i=1;i<=num1;i++){
    factorialArray.push(i);
    console.log("i "+i);
}
console.log(factorialArray);
for (let i = 1; i < factorialArray.length; i++) {
    const element = factorialArray[i];
    numFactorial=numFactorial*element;
}
console.log(numFactorial);

let result=document.getElementById("paragraph");
document.write(result=numFactorial);
