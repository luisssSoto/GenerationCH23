let myVar=1;

let myArrayA=[];//literal declaration
let myArray1= new Array();//instance declaration 

let myArray2=[30,31,32,33]
console.log('Index in my Array2 is: ', myArray2[0]);
console.log('Index in my Array2 is: ', myArray2[1]);
console.log('Index in my Array2 is: ', myArray2[2]);
console.log('Index in my Array2 is: ', myArray2[3]);

console.log('The number of elements inside Array2 is: ', myArray2.length)

let myArray3=new Array();
myArray3=['ey', 'what\'s', 'up'];
console.log(myArray3[1]);

let myArray4=[{name:"Naruto"}, {lastName:"Uzumaki"}, {age:16}];
console.log(myArray4[1].lastName);

//method .length
console.log('The number of elements inside Array2 is: ', myArray2.length);

//method .sort()
myDisorderArray=[3,5,8,1,9,7];
console.log('I have order the last array', myDisorderArray.sort());

//method .pop()
console.log('I pop the last element: ', myDisorderArray.pop());
console.log(myDisorderArray);

//method .push()
console.log(myArray4.push({village:'Leaf\'s Village'}));
console.log(myArray4[3].village);

//method .reverse()
console.log(myArray4.reverse());

/*The strings uses indexation as arrays
*/
let jv='javascript'
console.log(jv[5]);
console.log(jv);

/*
Matriz
*/
let myMatriz = [[1,2,3],    
                [4,5,6]
                [7,8,9]]

console.log(myMatriz[0][0])
console.log(myMatriz[1][1])