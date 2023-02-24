// ● Crear un programa en Javascript que realice lo siguiente:
// ○ Debe solicitar al usuario un número por prompt o por input y guardarlo.
// ○ Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8,
// debe mostrar 8 números de la serie de Fibonacci.
// ○ Debe imprimir el resultado por consola o por el DOM.
// ○ Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un
// mensaje de error y volver a solicitar el dato.
// ○ Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:
let num1=parseInt(prompt("Let me know any number you want: "));
let fibonacciArray=[];
let fibonacciNum=0;
let add=0;

while(Number.isInteger(num1)===false){
    alert("The last value wasn't an integer number, please try with an interger number");
    num1=parseInt(prompt("Let me know any number you want: "));
}
for (let i = 0; i < num1; i++) {
    if(num1===0){
        fibonacciNum=0;
        break;
    }
    else if (num1===1){
        fibonacciNum=1;
        break;
    }
    console.log(i);
    console.log(i+1);
    add+=i+i+1;
    console.log(add);
    
    //fibonacciArray.push(i);
}
console.log(fibonacciArray);

// for (let i = 0; i < fibonacciArray.length-1; i++) {
//     let a=fibonacciArray[i];
//     let b=fibonacciArray[i+1];
//     if(num1===0){
//         fibonacciNum=0;
//     }
//     else if(num1===1){
//         fibonacciNum=1;
//     }
//     else if(num===2){
        
//     }
//     console.log(a);
//     console.log(b);
//     console.log(a+b);
// }
// console.log(fibonacciNum);

// ○ Entrada:
// ■ 3
// ○ Salida:
// ■ 0, 1, 1.
// ○ Entrada:
// ■ 10
// ○ Salida:
// ■ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
// ● Pruébalo con los números que se te ocurran.
// ● Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
// ● Colócalo en un repositorio llamado “logica-programacion-4”
// Sugerencias:
// ● La sucesión de Fibonacci es una secuencia infinita de números naturales; a partir del 0 y el 1, se van sumando a
// pares, de manera que cada número es igual a la suma de sus dos anteriores, de manera que:
// ○ Sucesión: 0, 1, 1, 2, 3, 5, 8
// ○ 0 + 1 = 1
// ○ 1 + 1 = 2
// ○ 2 + 1 = 3
// ○ 3 + 2 = 5
// ○ 5 + 3 = 8
// ○ …
// © 2022 Generation: You Employed, Inc.
// 3
// SA-LPD4 - Ejercicio de lógica de programación 4 (1 hora, asincrónico)
// ● Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu
// programa.
// ● Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo HTML y enlazar tu script.
// ● Para ayudarte puedes desarrollar un algoritmo y el pseudocódigo.