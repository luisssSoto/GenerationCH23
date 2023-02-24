let n1=parseInt(prompt("Introduce your first number: "));
let n2=parseInt(prompt("Introduce your second number: "));
let n3=parseInt(prompt("Introduce your third number: "));

var disorderList=[n1,n2,n3];
console.log(disorderList);
var greaterToLeasser=[];
var leasserToGreater=[];


let greater=0;
let middle=0;
let leasser=0;

var emer=0;

areSwitches=true
while (areSwitches == true){
    areSwitches = false
    for(i=0; i<disorderList.length-1; i++){
            if (disorderList[i]>disorderList[i+1]){
                areSwitches = true
                emer=disorderList[i];
                disorderList[i]=disorderList[i+1];
                disorderList[i+1]=emer;
            if(disorderList[i] === disorderList[i+1]){
                    console.log("The element: ", disorderList[i], "and", disorderList[i+1], "are equals")
                }
            else{
                    console.log("It wasn't matches")
                }
            }
    } 
}

console.log(disorderList);

greaterToLeasser=disorderList.reverse();
console.log("The list from greater to leasser is: ", greaterToLeasser);

leasserToGreater=greaterToLeasser.reverse();
console.log("The list from leasser to greater is: ", leasserToGreater);


leasser=leasserToGreater[0];
middle=leasserToGreater[1];
greater=leasserToGreater[2];
console.log("The leasser number is: ", leasser, "The middle number is: ", middle, "The number greater is: ", greater );



let element=document.getElementById("lTG");
document.write("The list from leasser to greater is: ", element.innerHTML);

element.innerHTML="Test";
