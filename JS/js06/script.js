/*DOM
-Node: Es la unidad mas basica dentro del documento
<title>Node's Example
<p>Son's Node</p>
</title>

-Document:Node raiz es el padre de todos los nodes es de tipo documento
-Element: Son todos los tags etiquetas <h1> <body>
-Atributes: Nodes que dan informacion extra al tag por ejepmlo
<a>href:</a> endonde href seria el Attribute's Node
-Comments: Comentarios en el HTML 
*/

//Reading Nodes
/*
Metodos tradicionales(Se usan en veriones anitguas de JS)
    -document.getElementById
    -document.gerElementsByTagName
    -document.getElementsByClassName

*/


var elementIdAdd=document.getElementById("addButton");
console.log(elementIdAdd);

var elementTag=document.getElementsByTagName("button");
console.log(elementTag);
console.log("first element of mi list", elementTag[0]);

var elementClass=document.getElementsByClassName("buttons");
console.log(elementClass);

/*Metodos recientes
    -document.querySelector(#addButton)
    -document.querySelectorAll(.addButton)
*/

// var anElement=document.querySelector("#input1");
// console.log(anElement);

// var allElements=document.querySelectorAll(".buttons");
// console.log(allElements);


//DOM's Calculator

var number1=document.getElementById("input1");
var number2=document.getElementById("input2");

var addBttn=document.getElementById("addButton");
var minusBttn=document.getElementById("minusButton");
var multiplyBttn=document.getElementById("multiplyButton");
var divisionBttn=document.getElementById("divisionButton");

var result=document.getElementById("result");


/*
Creating Nodes
    -document.createElement(Node's type)

*/

//Creacion de una etiqueta del tipo imagen
const dogsImagen=document.createElement("img");

//Creating attributes en la etiqueta
dogsImagen.src="https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
dogsImagen.alt="Little puppy"
dogsImagen.style.width="150px";

//Poner elementos o nodos en el html
document.body.append(dogsImagen);



//Investigar esto----->parentElementBefore, appendChild, adjacent

//Actualizar Nodes
//1.step Identificar el node que se desea cambiar
//2.step Modificar el node (inner)(outer)

// var resultChanging=document.getElementById("resultChanging");
// resultChanging.innerHTML="Waves, I just changed the text";

//Investigar 
//document.createTextNode(texto)

//Metodos para insertar elementos
/*
    -parentElement.append
    -parentElement.insertBefore
    -parenElement.insertAdjacentElement
*/

//Metodos para modificar elementos
/*
    -node.outerHTML (leer o referenciar el elmento)
    -node.innerHTML (modificar el elemento)
*/


//Eventos
//First step
// const textToChange=document.querySelector("#h1");

// //Second step
// function changeColor(color){
//     textToChange.style.color=color;
// }


// Calculator's functions
function add(){
    let n1=parseInt(input1.value);
    let n2=parseInt(input2.value);
    let resultAdd=n1+n2;
    result.innerHTML=resultAdd;//Poner el resultado en su lugar
}
function minus(){
    let n1=parseInt(input1.value);
    let n2=parseInt(input2.value);
    let resultMinus=n1-n2;
    result.innerHTML=resultMinus;

}
function multiply(){
    let n1=parseInt(input1.value);
    let n2=parseInt(input2.value);
    let resultMultiply=n1*n2;
    result.innerHTML=resultMultiply;

}
function division(){
    let n1=parseInt(input1.value);
    let n2=parseInt(input2.value);
    let resultDivision=n1/n2;
    result.innerHTML=resultDivision;

}

//Crear un evento
/*
    -node.addEventListener("evento a escuhar", accion a ejecutar cuando se escuche)
*/

addBttn.addEventListener("click", add);
minusBttn.addEventListener("click", minus);
multiplyBttn.addEventListener("click", multiply);
divisionBttn.addEventListener("click", division);