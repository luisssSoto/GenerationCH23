let lista=[12,5,80,34];
console.log(lista.length);
for (let i = 0; i < lista.length; i++) {
    const element = lista[i];
    console.log(element); 
}

//Copia un array a otro .slice() no altera a la original
let newList=lista.slice();
console.log(newList);
newList.push("n number");
console.log(lista);
console.log(newList);

//.join() no altera a la original
let msg=lista.join("!");
console.log(msg);
console.log(lista);

//.push() si altera la original
let pushList=lista.push("hello");
console.log(pushList);
lista.push(100,500);
console.log(lista);

//.concat() no altera la original
let conList=lista.concat(200,300);
console.log(conList);
console.log(lista)

//.pop() si altera la original
let popList=lista.pop();
console.log(popList)
console.log(lista);

//.shift() si altera la original
let shiftList=lista.shift();
console.log(shiftList);
lista.shift();
console.log(lista);

//.splice() si altera la original
let spliceList=lista.splice(0,1);
console.log(spliceList)
console.log(lista)

//.reverse() si altera la original
let reverseList=lista.reverse();
console.log(reverseList)
console.log(lista)

//.sort()
let sortList=lista.sort()
console.log(sortList);

lista.sort(
    function (value1, value2){
        return value1-value2;
    }
)
console.log(lista);

let mapList=lista.map(
    function (value1) {
        return value1*2
    }
);

console.log(mapList);
