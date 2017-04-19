/* 	1. Write a function that prints out the current date and time in 
	the following format: "Today is: DayOfTheWeek, HH:MM DD/MM/YYYY".
	Ex. "Today is: Monday, 7:00 13/3/2017"
*/

function today(){
	var now = new Date();
	var daysOfTheWeek = ["Sunday", "Monday", "Tuesday", 
		"Wednesday", "Thursday", "Friday", "Saturday"]
	var result = "Today is: " + daysOfTheWeek[now.getDay()] + ", " 
		+ now.getHours() + ":" + now.getMinutes() + " " 
		+ now.getDate() + "/" + (now.getMonth()+1) + "/" 
		+ now.getFullYear();

	return result;
}

console.log(today());

/*  2. Write a function to see if a given year is a leap year.
	A year is a leap year if it is divisible by 4, except for 
	years that are divisible by 100. The years that are divisible
	by 400 however are leap years.
*/
function isLeapYear(year) {
	// year is divisble by 4
	if (year%4===0) {
		// year is divisible by 400
		if (year%400 === 0) {
			return true;
		}
		// year is divisible by 100
		else if(year%100 === 0) {
			return false;
		}
		else {
			return true;
		}
	}
	// year is not divisible by four
	else {
		return false;
	}
}



/*  3. Write a function that plays a guessing game.
	-pick a random number between 1-20
	-use prompt() to get user input
	-check if guess matches or not
		-if match -> give congratulations message with # of tries
		-if fail -> reprompt for next guess 
*/
function guessGame()	{
	var secretNumber = Math.ceil(20* Math.random());
	var guess =Number(prompt("Guess a number between 1 & 20"));
	var inc = 1;
	while (guess !== secretNumber)	{
		guess = Number(prompt("Wrong guess, Keep Trying"));
		inc++;
	}
	if (guess === secretNumber) {
		alert("Got it!, it took " + inc + " tries");
	}
}


/* 	4. Write a function which takes a string and a letter. It returns 
	the number of times the letter appears in the string
*/
//numlaiw = short for Number of times Letter Appears in the Word
function numlaiw(word, letter) {
	var numlis = 0; // number of times letter is in the string
	for (var i = 0; i < word.length; i++) {
		if (letter === word[i]) {
			numlis++;
		}
	}
	return numlis;
}

/* 	5. Write a function that takes an array of numbers and prints the 
	smallest and largest numbers from the array.
*/
function smallLarge(arrayNum){
	var min =arrayNum[0];
	var max =arrayNum[0];
	for(var i=0;i<arrayNum.length;i++){
		if(arrayNum[i]<min){
			min=arrayNum[i];
		}
		if(arrayNum[i]>max){
			max=arrayNum[i];
		}
	}
	return "The smallest number is: " + min + ", The largest number is: " + max;
}
/*	6. Write a function which takes an object as a parameter and prints
	all the property names and their values. Also give the total number of
	properties in the object.
*/

function allProperties(misterObject){
	var numOfProps = 0;
	for (var prop in misterObject) {
		var valOfProp = misterObject[prop]
		console.log(prop, valOfProp);
		numOfProps = numOfProps + 1;
	}
	console.log(valOfProp);
	return numOfProps;
}

var superman = {
	name: "Superman",
	"real name": "Clark Kent",
	height: 76
};

// console.log(allProperties(superman));

	/*7. Use the following array for this problem.*/
	
	var library = [ 
   {
       author: 'Bill Gates',
       title: 'The Road Ahead',
       readingStatus: true
   },
   {
       author: 'Steve Jobs',
       title: 'Walter Isaacson',
       readingStatus: true
   },
   {
       author: 'Suzanne Collins',
       title:  'Mockingjay: The Final Book of The Hunger Games', 
       readingStatus: false
   }];

   /*Write a function which takes as its parameter the above array. Then 
   for each of the elements write a log to the console. Here are example
   logs: "I am reading 'The Road Ahead' by Bill Gates",
   		 "I will read 'Mockingjay: The Final Book of The Hunger Games' by Suzanne Collins"
   If the readingStatus is true, then it should say "am reading", and
   if the readingStatus is false, then it should say "will read".
 */
function read(library){
	for (var i = 0; i < library.length; i++) {
		var book = library[i];
		var title = book.title;
		var author = book.author;
		var readingStatus = book.readingStatus;
		if(readingStatus) {
			console.log("I am reading '" + (title) + "' by " + (author));
		}
		else{
			console.log("I will read '" + (title) + "' by "  + (author));
		}
	}
}
