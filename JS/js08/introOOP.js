let person={
    name:'Juana',
    lastName:'Perez',
    fullName: function(){
        return "The full name is: ", this.name + this.lastName;
    }
}
console.log(person.name);
console.log(person.lastName);
console.log(person.fullName());

