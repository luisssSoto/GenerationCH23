var c=parseInt(prompt("Get in any degrees Celius:"));
let numeric=Number.isInteger(c);
console.log("Is it a numeric value?",numeric);

while(numeric===false){
    alert("Sorry but you got in an incorrect value, try only numbers please:");
    c=parseInt(prompt("Get in any degrees Celius:"));
    if(Number.isInteger(c) == true){
        numeric=true;
    }
}
let celsiusToFarenheit=(c*(9/5)+32);
let celsiusToKelvin=c+273.15;

console.log("Your degrees Celsius into Farenheit are: ", celsiusToFarenheit);
console.log("Your degrees Celsius into Kelvin are: ", celsiusToKelvin);

let cF=document.getElementById("results");
document.write("Your degrees Celsius into Farenheit are: ", celsiusToFarenheit,);
document.write(" Your degrees Celsius into Kelvin are: ", celsiusToKelvin);
