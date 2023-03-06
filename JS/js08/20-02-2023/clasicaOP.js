class OperacionesAritmeticas{
    number0=0;
    numbe1=1;

    adding(a,b){
        return a+b;
    }
}

let operation1;
operation1=new OperacionesAritmeticas();
console.log(operation1.number0);
console.log(operation1.numbe1);
console.log(operation1.adding(5,5));

let operation2=new OperacionesAritmeticas();
console.log(operation2.adding(1,99));

let operation3=new OperacionesAritmeticas();
operation3.number0=8;
operation3.numbe1=5;
console.log(operation3.adding(operation3.number0, operation3.numbe1));

class Dog{
    nameDog='Joseronni'
    diet="met"
    constructor(nameDog){
        this.nameDog=nameDog;
    }
    favoriteFood(){
        return this.diet
    }
}
let dog1=new Dog('Peperoni');
console.log(dog1.nameDog);
console.log(dog1.favoriteFood());