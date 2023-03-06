// JavaScript es sincrono, secuencial y bloqueante
alert("Wait");
console.log("Hello, good morning");

// setTimeout(
//     function(){
//         console.log("Hello world, later...");        
//         },5)
// console.log("Sorprise");

const myCallBack=()=>console.log("Hello world delate");
setTimeout(myCallBack);
console.log("Sorprise");