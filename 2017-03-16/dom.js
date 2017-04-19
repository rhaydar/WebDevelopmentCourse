
// var button = document.getElementsByTagName("button")[0];
// button.addEventListener("mouseover", function() {
// 	var h1 = document.getElementById("important");

// 	var r = Math.floor(256*Math.random());
// 	var g = Math.floor(256*Math.random());
// 	var b = Math.floor(256*Math.random());

// 	var rgb = "rgb(" + r + "," + g + "," + b + ")";
// 	h1.style.color = rgb;
// });

// var p1 = document.querySelector("p");
// p1.addEventListener("mouseover", translate);
// var hola = p1.innerHTML;

// function translate() {
// 	p1.textContent = "Hello";
// }

// p1.addEventListener("mouseout", translate1);

// function translate1() {
// 	p1.textContent = hola;
// }

// var li = document.getElementsByTagName("li");
// for (var i = 0; i < li.length; i++) {
// 	li[i].addEventListener("click", function(event) {
// 		console.log("You clicked a li");
// 		event.stopPropagation();
// 	});
// }

// var ul = document.getElementsByTagName("ul");
// for (var i = 0; i < ul.length; i++) {
// 	ul[i].addEventListener("click", function(event) {
// 		console.log("You clicked an ul");
// 		event.stopPropagation();
// 	});
// }

// var body = document.querySelector("body");
// body.addEventListener("click", function() {
// 	console.log("You clicked the body");
// });



// var arr = [1,2,3];
// for (var i = 0; i < arr.length; i++) {
// 	arr[i]
// }

// var styles = {
// 	color: "orange",
// 	fontSize: "20px"
// };

// $("a").css(styles);

// // vanilla JS
// var btn = document.querySelector("#btn");
// btn.addEventListener("click", function() {
// 	console.log("You clicked me!")
// });
// // jQuery
// $("#btn").click(function() {
// 	console.log("You clicked me using jQuery!")
// });


$("#btn").on("click", function() {
	$("h1").addClass("important");
});

$("h1").on("mouseover", function() {
	$(this).removeClass("important");
});