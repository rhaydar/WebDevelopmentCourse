// sample
// calculate the 
// area of a triangle

function areaOfTriangle(b,h){
	return b*h/2;
}

// 2. give the average of an array of numbers
function avg(array) {
	var sum = array.reduce(function(prev,current){
		return prev + current;
	});
	return sum/array.length;
}

//FUNCTION 2 
function average2(arrayOfNumbers){
	var sum = 0;
	for(var i = 0; i < arrayOfNumbers.length; i++){
		sum += arrayOfNumbers[i];
	}
	var average = sum / arrayOfNumbers.length;
	return average;
}
console.log(average2([7,8,9]));
// 3. double the elements of an array, 
// do not return a new array

function double(array) {
	for (var i = 0; i < array.length; i++) {
		array[i] *= 2;
	}
}
var num = [2,3,4,5];
double(num);
console.log(num);