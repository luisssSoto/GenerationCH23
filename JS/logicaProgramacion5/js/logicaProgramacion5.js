// ¡Aplica tus conocimientos en programación para resolver el siguiente problema!

// Instrucciones:

// Crear un programa en Javascript que realice lo siguiente:
// Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
// Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
// Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
// El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
// Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
// Al final de tu práctica, tienes que subir el ejercicio a tu repositorio de GitHub.
// Colócalo en un repositorio llamado “logica-programacion-5”
// Sugerencias:

// Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
// Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo HTML y enlazar tu script.
// Para ayudarte puedes desarrollar un algoritmo y el pseudocódigo.


let numberSecret=parseInt(prompt("Escoge un numero secreto: "));
let num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
let isNum=Number.isInteger(num1);
alert(isNum);

while(isNum===false){
    if(isNum===false && Number.isInteger(num1)===false){
        alert("El valor introducido no es un numero, intenta otra vez");
    }
    num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
    isNum=Number.isInteger(num1);
    if(isNum===true){
        if(num1!=numberSecret){
            alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
            isNum=false;
        }
        else{
            alert("Felicidades, adivinaste el número secreto")
            isNum=true;
            }
    }
}
while(isNum===true){
    if(num1!=numberSecret){
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
        num1=parseInt(prompt("Adivina en que numero estoy pensando del 1 al 100: "));
        isNum=true;
    }
    else{
        alert("Felicidades, adivinaste el número secreto")
        isNum=false;
        }
}

let msj=document.getElementById("mensaje");
document.write("Este fue el numero secreto "+ numberSecret);
