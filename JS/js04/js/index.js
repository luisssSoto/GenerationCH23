let myVar=5;
console.log(typeof(myVar));

// Structure Data Type
let myArray=[2,3,4,5,6];
console.log(myArray);
console.log(typeof(myArray))
let myArrayObj=new Array();
console.log(typeof(myArrayObj));
console.log(myArray[4]);
myArrayObj.push(1,2,3);
console.log(myArrayObj)
myArrayObj.pop();
console.log(myArrayObj)
myArray.push('Add');
console.log(myArray);

//Matriz
let myMatriz=  [[1,2,3],
                [4,5,6],
                [7,8,9]]
console.log(myMatriz[0][2]);

// Bucle for para Arrays
for(let i=0; i<myMatriz.length; i++){
    console.log(myMatriz[i]);
}

// Bucle for para Matriz
for(let i=0; i<myMatriz.length; i++){
    console.log(myMatriz[i])
    for(let j=0; j<myMatriz[i].length; j++){
        console.log(myMatriz[i][j]);
    }
}

//Bucle for of para Matriz
for (const i of myMatriz) {
    console.log(i);
    for (const j of i) {
        console.log(j); 
    }
}

//Bucle for Each para Matriz
myMatriz.forEach(element1 => {
    console.log(element1);
    myMatriz.forEach(element2 =>{
        console.log(element2)
    }) 
});

let anotherMatriz=[[],[],[]];

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        anotherMatriz[i][j]=myMatriz[i][j]*myMatriz[i][j];
    }
}
console.log("Mi matriz: "+ anotherMatriz);

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log(anotherMatriz[i][j]);
    }
}


//While
let count=0;
while(count<10){
    console.log(count);
    count++;
}