const person = {
    name : "Om",
    age : 218,
    "person hobbie" : ["cycling","games","sketches"]
}

for(let key in person){
    console.log(key," : " ,person[key]);
}

for(let key in person){
    console.log(`${key} : ${person[key]}`);
}

console.log(Object.keys(person));

console.log(Object.values(person));