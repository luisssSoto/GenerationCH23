//Control de flujo
/*Las sentencias de control if - else nos juntos con los 
operadores logicos y relacionales nos ayudan a darle un
control al programa de acuerdo a la condicion que se 
ejecute, es decir si se cumple una condicion, se ejecutara
cierta parte de codigo, y si no se cumplira otra */

let age=parseInt(prompt("Excuse me, how old are you? "))
if(age<= 17){
    document.write("<h1>Congratulations you are a child</h1>")
}
else if(age === 18){
    document.write("You're 18 years old")
}
else if (age >18){
    document.write("<h2>You're an adult</h2>");
}
else{
    document.write("<h3>That value is not data available</h3>")
}

