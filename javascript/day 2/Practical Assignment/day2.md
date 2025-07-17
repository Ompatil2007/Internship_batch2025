


# - 1. Variables

Variables are used to store data.

let name = "John";
const age = 25;
var isStudent = true;


- let → block-scoped, can be updated  
- const → block-scoped, **cannot be reassigned**  
- var → function-scoped (older syntax)

---

# - 2. Keywords

Reserved words used by JavaScript for specific purposes.

Examples:
- let, const, var
- if, else, for, while
- function, return, break, continue
- true, false, null, undefined

You **cannot** use keywords as variable names.

---

# - 3. Strings

A sequence of characters, enclosed in quotes.


let greeting = "Hello, world!";
let name = 'Alice';
let message = Hi, ${name};


You can use single ('), double ("), or template literals ().

---

# - 4. String Methods

Useful functions to work with strings:


let str = "JavaScript";

str.length        
str.toUpperCase() 
str.toLowerCase()   
str.includes("Script")
str.slice(0, 4)     
str.replace("Java", "Type")


---

# - 5. Operators

## - Arithmetic Operators:

+  -  *  /  %  ** 


## - Assignment:

=  +=  -=  *=  /=


## - Comparison:

==  ===  !=  !==  >  <  >=  <=


## - Logical:

&&  ||  !

---

# - 6. Loops

Used to repeat actions.

## - For Loop:

for (let i = 0; i < 5; i++) {
  console.log(i);
}


## - While Loop:

let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}


## - Do...While Loop:

let i = 0;
do {
  console.log(i);
  i++;
} while (i < 5);

---

# - 7. If-Else

Used for decision-making.

let age = 18;

if (age >= 18) {
  console.log("Adult");
} else {
  console.log("Minor");
}


You can also use:

if (...) {
  ...
} else if (...) {
  ...
} else {
  ...
}


---

# - 8. Arrays

Arrays store multiple values in a single variable.

let fruits = ["apple", "banana", "cherry"];
console.log(fruits[1]); // "banana"


## - Array Methods:

fruits.push("orange");     
fruits.pop();              
fruits.shift();            
fruits.unshift("grape");   

## - Array Destructuring:

let numbers = [10, 20, 30];

let [a, b, c] = numbers;

console.log(a);   
console.log(b);  
console.log(c);


---

