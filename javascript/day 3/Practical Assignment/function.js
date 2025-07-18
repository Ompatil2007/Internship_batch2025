const print1 =function print1(){
    console.log("Heyy From Global Block Function");
}

const printText = () =>{
    console.log("Heyy From Arrow Function");
}

function print(){
    console.log("Heyy From Function Block");
}
print1();
printText();
print();
