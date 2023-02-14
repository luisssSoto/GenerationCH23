//Exercise 1
let GPAacumulativo=3;
let Unidadestotales=120;
if (GPAacumulativo>2.0){
    if(Unidadestotales>=120);{
        console.log("¡Puede graudarse!");
    }
    }
//my exercise 1
if(GPAacumulativo>2.0 && Unidadestotales>=120){
    console.log("¡Puede graduarse!")
}

let cspCalificacion=75;
let progCalificacion=75
//Exercise 2
if(cspCalificacion>=75){
    console.log("¡Eres elegible para la graduacion!");
}
if(progCalificacion>=75){
    console.log("¡Eres elegible para la graduacion!");
}

//my Exercise 2
if(cspCalificacion>=75 && progCalificacion>=75){
    console.log("¡Eres elegible para la graduacion!");
}

//Exercise 3
let texto="Hola Mundo";
var newTexto=[];
for (let i = 0; i < texto.length; i++) {
    const element = texto[i];
    console.log(element);
    if (element!=" " && element !== "a"){
        newTexto+=element+".";
    }
    else if(element == "a"){
        newTexto+=element+" "
    }
}
console.log(newTexto);

