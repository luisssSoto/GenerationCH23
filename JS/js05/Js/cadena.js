let text1="oHell0po World";
let message="The messages has "+text1.length+" characters ";
console.log(message);
for (let i = 0; i < text1.length; i++) {
    const element = text1[i];
    message+=element+" ";
}
//.trim() elimina el ultimo espacio en blanco
let messageTrim= message.trim();
console.log(message);
console.log(message.trim());

//.toUpperCase() no modicable
m1=message.toUpperCase();
console.log(m1)
console.log(message);

//.substr() no modificable
let partOfText=text1.substr(0,5);
console.log(partOfText);
console.log(text1.substr(7));
console.log(text1.substr(-5));
console.log(text1);

//.substring() no modificable
let partOfString=text1.substring(5,7);
console.log(partOfString);
console.log(text1)

//.split() no modificable
let splitText=text1.split(" ");
console.log(splitText)
console.log(splitText[0]+"/ "+ text1[1]);

//.includes("Character") no modificable
if (text1.includes("1")) {
    console.log("The character is in the text: ", text1 );
}
else{
    console.log("The character is not in the text: ", text1 );
}


