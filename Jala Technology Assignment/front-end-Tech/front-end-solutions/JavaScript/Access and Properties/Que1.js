let button = document.getElementById("btn");

button.onclick = () => {
  console.log(this);
  this.document.getElementById("btn").classList.add("hidden");
  //   button.classList.add("hidden");
};

/*********************  call() *********************/

const Utils = {
  getDetails: function (country, city) {
    return `[Name : ${this.firstName} ${this.lastName}, Country: ${country}, City: ${city}]`;
  },
};

const Person1 = {
  firstName: "Vinit",
  lastName: "Pandey",
};

const Person2 = {
  firstName: "Simran",
  lastName: "Singh",
};

console.log("From call() method");
console.log(Utils.getDetails.call(Person1, "India", "Lucknow"));

/*********************  apply() *********************/
console.log("From apply() method");
console.log(Utils.getDetails.apply(Person1, ["India", "Lucknow"]));
