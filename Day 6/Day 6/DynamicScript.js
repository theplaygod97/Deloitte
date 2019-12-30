function display(){
	var num1 = prompt("Enter first number :","12");
	var num2 = prompt("Enter first number :","20");
	var result = parseInt(num1)+parseInt(num2);
	alert("The sum of two numbers are :"+result);
}
function demo(){
	var res = confirm("Do you want to continue :");
	if(res == true){
		alert("OK Clicked")
	}
	else{
		alert("Cancel clicked")
	}
}
function accept(num){
	alert("You have given :"+num)
}
function displaygreetings(msg){
	if(msg == null)
		msg = "Good Night"
		alert(msg)
}
