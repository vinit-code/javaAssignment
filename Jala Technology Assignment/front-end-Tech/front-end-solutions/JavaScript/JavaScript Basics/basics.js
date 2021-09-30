"use strict";

// This is single line comment
let name = "Vinit Pandey";

/* 
    This is multi line comment 
    ......
    ......
    This is another line of comment
*/

console.log("Indide JS");

let fruits = ["Guavava", "Grapes", "Apple", "Avocado", "Banana"];

let button = document.getElementById("sortButton");

button.onclick = () => {
  fruits = fruits.sort((a, b) => {
    if (a <= b) return -1;
    return 1;
  });
  //   showFruits(fruits);
  displayFruit(fruits);
};

const showFruits = (fruits) => {
  fruits.forEach((fruit) => console.log(fruit));
};

const displayFruit = (fruits) => {
  for (const index in fruits) {
    console.log(fruits[index]);
  }
};

const Person = {
  firstName: "Vinit",
  lastName: "Pandey",
};

console.log("Method #1:");
console.log(`[First Name: ${Person.firstName}, Last Name: ${Person.lastName}]`);

console.log("Method #2");
console.log(
  `[First Name: ${Person["firstName"]}, Last Name: ${Person["lastName"]}]`
);

// Variable Hoisting
age = 21;
console.log(`My age is ${age}`);
let age;
