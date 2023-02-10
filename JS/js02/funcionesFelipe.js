div(10,5);
/* Por que son importantes las funciones?
- Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
- Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
- Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
- Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)*/


/*
Tips:
1. Nombre descriptivo, un verbo generalmente
2. Datos de entrada----> parametros
3. Procesos o instrucciones a ejecutar
4. Salida (return)
*/

//Funcion directa tiene un alcance global "Hoisting"
function addShoppingCart(){
    //Lo que hace una funcion
}

//Calling to Function
addShoppingCart();

//Funcion anonima no tiene un alcance global
let x=function(){
    let v1=5;
    let v2=7;
    let suma=v1+v2;
    console.log("Esta es una funcion anonima: " + suma);
}
x();


// Scope and Hoisting


function div(par1, par2){
    let rDiv=par1/par2;
    console.log(par1,par2);
}

div(88,10);


//Hoisting error
// console.log(edad);
// let edad="30";

/*
Tipos de funciones:

-funciones directas - nombres son mas comunes
-funciones anonimas - viven pegadas a una variable
-funciones como metodos (para especificar que hace mi objeto)
-funciones como constructores (para construir o crear un objeto)
*/

//Funciones flecha ECMA Script6
/*Sintaxis: Si es una linea de codigo podemos hacerlo sin llaves de lo contrario NO*/
let suma = (a,b) => a+b;

//Otra funcion flecha "mul"

const mul = (a,b) => {
    const r= a*b;
    console.log(r);
}

// Return

/* La sentencia return finaliza la ejecucion de la funcion, 
y especifica un valor para ser devuelto a quien llama a la 
funcion. O lo que es lo mismo, usamos return para finalizar 
y tambien para poder asignar el resultado a una variable.*/

function areaSquare1(){
    let lado = 5;
    let area = lado*lado
    console.log("Funcion sin return: ", area)
}

areaSquare1();
let a=areaSquare1();
a;

//Return Function
function areaSquare2(){
    let lado = 5;
    let area = lado *lado;
    return area;
}

console.log("Funcion con return: ", areaSquare2());

let b =areaSquare2();

console.log("Funcion con return: ", b)




