//Day - 5

fun main() {
    var temperature = 25
    if (temperature > 20)
    {
        println("It's a warm day")
    }
}

---------------------------


fun main() {
    var temperature = 15
    if (temperature > 20)
    {
        println("It's a warm day")
    }
    else{
        println("Good Weather")
    }
}

---------------------------


fun main() {
    var mark = 81
	if (mark >= 90){
        println("A grade")
    }
    else if (mark >=85){
        println("B grade")
    }
    else if (mark >=75){
        println("C grade")
    }
    else{
        println("D grade")
    }
}


---------------------------



fun main() {
    val a = 5
    val b = 20
    val Operator = "Mul" 
    //Add
    if (Operator == "Add"){
        println(a+b)
    }
    //Mul
    else if (Operator == "Mul"){
        println(a*b)
    }
    //Div
    else if (Operator == "Div"){
        if(b!=0){
            println(a/b)
        }
        else{
            println("Error: Divivsion by zero")
        }
    }
    //Sub
    else if (Operator == "Sub"){
        println(a-b)
    }
    else{
        println("Error: Unsupported Operator")
    }
}


---------------------------


fun main() {
    val age = 15
    if (age < 13)
    {
        println("You are a child")
    }
    else if (age in 13..19)
    {
        println("You are a teenager")
    }
    else if (age in 20..64)
    {
        println("You are an adult")
    }
    else
    {
        println("You are a senior")
    }
}

---------------------------


fun main() {
    val dayofweek = 1
    val dayname = when(dayofweek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println("Day of the week: $dayname")
}

---------------------------


fun main() {
    val number = 10
    when{
        number%2 == 0 -> println("$number is even")
        number%2 != 0 -> println("$number is odd")
        else -> println("Unexpected number")
    }
}
