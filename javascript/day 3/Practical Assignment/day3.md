
# JavaScript Concepts Summary

---

## - Dot Bracket Notation

- Used to access object properties in JavaScript.
- Dot notation: object.key
- Bracket notation: object["key"]
- Bracket is useful when keys have spaces or are dynamic.

let obj = { name: "Om", "full name": "Om Patil" };
console.log(obj.name);    
console.log(obj["full name"]);

---

## - Introduction to Objects

- Objects are collections of key-value pairs.
- Keys are strings (or Symbols), and values can be any data type.

let person = {
  name: "Ravi",
  age: 25,
  isStudent: true
};


---

## - Nested Destructuring

- Destructuring objects or arrays within other objects/arrays.


const user = {
  name: "Om",
  address: {
    city: "Nashik",
    pin: 422003
  }
};

const {
  address: { city }
} = user;

console.log(city); 

---

## - Object Inside Array

- Common in APIs and structured data.

const users = [
  { name: "Om", age: 22 },
  { name: "Ravi", age: 25 }
];

console.log(users[1].name); // Ravi


---

## - Spread Operator (...)

- Used to expand elements of an iterable or object.

let arr1 = [1, 2];
let arr2 = [...arr1, 3, 4];

let obj1 = { a: 1 };
let obj2 = { ...obj1, b: 2 };

console.log(arr2); // [1, 2, 3, 4]
console.log(obj2); // {a: 1, b: 2}


---

## - Arrow Function

- Shorter syntax for writing functions.
- Does **not** have its own `this`.

const greet = (name) => `Hello, ${name}`;
console.log(greet("Om"));


---

## - Block Scope

- let and const are block-scoped.
- Variables inside {} are not accessible outside.

{
  let x = 10;
}
// console.log(x); // Error

---

## - Lexical Scope

- Inner functions have access to the variables of their outer functions.

function outer() {
  let a = 5;
  function inner() {
    console.log(a); // 5
  }
  inner();
}

---

## - Callback Function

- A function passed as an argument to another function.

function greet(name, callback) {
  callback();
  console.log("Hello", name);
}

greet("Om", () => console.log("Callback executed"));

---

## - Default Parameter

- Set default values for function parameters.

function greet(name = "Guest") {
  console.log(`Hello, ${name}`);
}

greet(); // Hello, Guest


---

## - Function Declaration

- A standard way to define a function.

function sayHello() {
  console.log("Hello!");
}

---

## - Function Inside Function

- Functions can be nested inside other functions.

function outer() {
  function inner() {
    console.log("Inner");
  }
  inner();
}
outer();

---

## - Hoisting Introduction

- Variables and function declarations are moved to the top during compilation.
- Only declarations are hoisted, **not** initializations.

console.log(x); // undefined
var x = 10;

---

## - Parameter Destructuring

- Directly extract values from objects or arrays in function parameters.

function print({ name, age }) {
  console.log(name, age);
}

print({ name: "Om", age: 21 });

