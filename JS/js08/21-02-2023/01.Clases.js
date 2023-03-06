// Note: En La POO en JavaScript no existe el Hoisting
//Object is la clase papa de todas las clases 
class Persona{
    constructor(nombre,apellido){
        this._nombre=nombre;
        this._apellido=apellido;
    }

    get nombre(){
        return this._nombre
    }
    set nombre(nombre){
        this._nombre=nombre;
    }

    get apellido(){
        return this._apellido
    }
    set apellido(apellido){
        this._apellido=apellido;
    }

    nombreCompleto(){
        return this.nombre+" "+this.apellido
    }

    //Sobreescribir el metodo de la clase Object
    toString(){
        return this.nombreCompleto();
    }

}

let persona1=new Persona('Mario', 'Bros');
console.log(persona1);
console.log(persona1);
persona1.nombre='Luigi';
console.log(persona1);

let persona2=new Persona('Bowser','Bros');
console.log(persona2.nombre);

let persona3=new Persona('Yoshi');
console.log(persona3.nombre)
console.log(persona3._nombre);

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre,apellido);
        this._departamento=departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento=departamento;
    }
    //Overroading-Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto()+' '+this._departamento;
    }
}

let empleado1=new Empleado('Boo', 'Character', "Bowser's Casttle");
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.nombreCompleto());//--->Overroading


//Polimorphism-Polimorfismo
let persona4=new Persona('Princess', 'Peach');
console.log(persona4.toString());
let empleado2=new Empleado('Toad', 'Mushroom', "Peach's Casttle" );
console.log(empleado2.toString());