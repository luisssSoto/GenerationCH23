// Exercise #1
// Part 1
// There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. 
//Create an array that has these three names in order.
let bankLine=["Sofia","David","Juan"];

// Part 2
// Two more people get added to the back of the line - Sara and Augustin. 
//The first person in line is called to the teller. What does the queue look like?
bankLine.push("Sara","Agustin");
console.log(bankLine);
bankLine.shift(0);
console.log(bankLine);

// Part 3
// It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. 
//One more person (Elena) shows up and goes to the end of the line. What does the queue look like?
 // (pos) es la posición para abreviar
bankLine.splice(1,2);
console.log(bankLine);
bankLine.push("Elena");
console.log(bankLine);