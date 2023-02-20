const myURL=document.URL.toString();
const myPromess=fetch(myURL);
myPromess.then(result=>console.log(result),e=>console.log(`error callback ${e}`));