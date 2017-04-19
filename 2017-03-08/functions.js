// function sign(n) {
// 	if (n < 0) {
// 		return "negative";
// 	}
// 	else {
// 		return "positive";
// 	}
// }

// // square function, takes in one parameter
// function square(x) {
// 	console.log(x*x);
// }

// var nums = [-1,2,-4,2,5,-7,-6];
// // for (var i=0; i<nums.length; i++) {
// // 	console.log(sign(nums[i]));
// // }


// // unnecessary code
// function extraCode() {
// 	return 2;
// }

// function numPizzas(persons) {
// 	return persons/2;
// }

// function cost(persons) {
// 	var pizzas = numPizzas(persons);
// 	var total = pizzas*6;
// 	total *= 1.0875;
// 	return total;
// }

// function costPerPerson(persons) {
// 	var total = cost(persons);
// 	// drinks
// 	total += 10;
// 	// tip
// 	total *= 1.15;
// 	// delivery fee
// 	total += 2;
// 	console.log("$" + total);
// 	var cPerPerson = Math.ceil((total-30)/persons);
// 	console.log("$" + cPerPerson);
// 	return cPerPerson;
// }

// for (var i=1; i<=20; i++) {
// 	console.log(i + " People");
// 	costPerPerson(i);
// 	console.log();
// }


// default parameters
// function add(a,b,c,d) {
// 	if (d === undefined) {
// 		d = 0;
// 	}
// 	var result = a+b+c+d;
// 	return result;
// }

// scope
// var a = "hi";
// function overWriteA() {
// 	a = "bye";
// 	console.log("inside: " + a);
// }

// overWriteA();
// console.log("outside: " + a);

// hoisting variables
// function hoist() {
// 	console.log(b);
// 	var a = 10;
// 	a *= 20;
// 	console.log(a);

// 	var b = 2;
// 	console.log(b);
// }

// hoisting functions
add(2,3);
console.log(subtract(2,3));


// add two numbers
function add(a,b) {
	return a+b;
}

// subtracting two numbers
function subtract(a,b) {
	return a-b;
};