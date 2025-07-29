//Using For each Loop

let arr = [1,2,3,4,5,6];
arr.forEach((value,index)=>{
    console.log(value,index);
});



   
//Using map 

const person = [
    {firstname:"Mayuresh",lastname:"Sali"},
    {firstname:"Anuj",lastname:"Shirsath"},
    {firstname:"Ishan",lastname:"Pawar"},

]


const Persons = person.map((persons)=>{
    return persons.firstname;
})
console.log(Persons);

//Using filter

const num = [1,2,3,4,5];

function isEven(number){
    return number%2==0;
}

const Even = num.filter(isEven);
console.log(Even);


//methods Array

const arr1 = ["mayuresh","om","anuj"];
console.log(arr1.slice(1,3));
console.log(arr1.fill(1,1,3));

//some method 

const arr2 = [
    {Name:"Mayuresh",age:12},
    {Name:"Anuj",age:18},
    {Name:"om",age:10},
]
const display = arr2.some((dis)=>{
    return dis.age<=10;
})
console.log("Childs = "+display );
    