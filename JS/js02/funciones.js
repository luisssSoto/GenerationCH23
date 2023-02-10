// funcion suma

let n1=parseFloat(prompt("Digita el primer valor: "));
let n2=parseFloat(prompt("Digita el segundo valor: "));

function suma(n1,n2){
    let rSuma=n1+n2;
    return rSuma
}

// Se puede asignar una funcion a una variable
let asignarSuma=suma(n1,n2);

// Se puede crear un a funcion anonima y esta asignarla a una variable
let anonimaSuma = function(n1,n2){
    let rAnonimaSuma=n1+n2;
    return rAnonimaSuma
}

alert("El resultado de la funcion suma es: " + (suma(n1,n2)));

alert("El resultado de la funcion suma asignada a la variable \"asignarSuma\" es: " + asignarSuma);

alert("El resultado de la funcion \"anonimaSuma\" es: " + anonimaSuma(n1,n2));


// funcion resta

let n3=parseFloat(prompt("Digita el primer valor: "));
let n4=parseFloat(prompt("Digita el segundo valor: "));

function resta(n3,n4){
    let rResta=n3-n4;
    return rResta
}

// funcion resta anonima
let anonimaResta=resta(n3,n4);

alert("El resultado de la funcion resta es: " + (resta(n3,n4)));

alert("El resultado de la funcion anonima resta es: " + anonimaResta);


// funcion multiplicacion

let n5=parseFloat(prompt("Digita el primer valor: "));
let n6=parseFloat(prompt("Digita el segundo valor: "));

function multiplicacion(n5,n6){
    let rMultiplicaicon=n5*n6;
    return rMultiplicaicon
}

// funcion multiplicacion anonima
let anonimaMultiplicacion=multiplicacion(n5,n6);

alert("El resultado de la funcion multipliacion es: " + (multiplicacion(n5,n6)));

alert("El resultado de la funcion anonima multiplicacion es: " + anonimaMultiplicacion);


// funcion division

let n7=parseFloat(prompt("Digita el primer valor: "));
let n8=parseFloat(prompt("Digita el segundo valor: "));

function division(n7,n8){
    let rDivision=n7/n8;
    return rDivision
}

// funcion division anonima
let anonimaDivision=division(n7,n8);

alert("El resultado de la funcion division es: " + (division(n7,n8)));

alert("El resultado de la funcion anonima division es: " + anonimaDivision);



