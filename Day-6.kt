//Day-6

fun main() {
	//include 5
	for(i in 1..5)
    {
    	println("number: $i")    
    }	
}

---------------------------


fun main() {
    //until 4 exclude 5
	for(i in 1 until 5)
    {
    	println("number: $i")    
    }	
}


---------------------------


fun main() {
    //downTo
	for(item in 5 downTo 1)
    {
    	println(item)    
    }	
}


---------------------------


fun main() {
    //downTo with step
	for(item in 5 downTo 1 step 2)
    {
    	println(item)    
    }	
}

---------------------------


fun main() {
    //iterating over a list
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits)
    {
        println("Fruit: $fruit")
    }
    for (i in fruits.indices)
    {
	//iterating over indices of the list
        println("Index: $i")
    }
}

---------------------------


fun main() {
    //while
    var i = 5
    while(i > 0)
    {
        println("$i")
        i--
    }
}

---------------------------


fun main() {
    //do while
    var i = 5
    do
    {
        println("Value: $i")
        i--
    }
    while (i > 5)
}

---------------------------


fun main() {
    //do while to print upto 1
    var i = 5
    do
    {
        println("Value: $i")
        i--
    }
    while (i > 0)
}

---------------------------

fun main() {
    //do while to print 1 to 5
    var i = 1
    do
    {
        println("Value: $i")
        i++
    }
    while (i < 6)
}

---------------------------

fun demo() 
{
    //demo function
    println("Hello, World!")
}
fun main()
{
    demo()
    println("Bye")
}
