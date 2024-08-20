//Day - 2

fun main() {
    val a = 20
    val b = 10
    val result = "Sum of $a and $b is ${a+b}"
    println(result)
}

---------------------------


fun main() {
    val letter: Char //Defining a character
    letter = 'A'
    print("$letter")
    print('\n') //It is for next line
    print('\$') //It is for printing $ sign
    print('\\') //It is for giving a slash in output
}

---------------------------


fun main() {
    print("""
    Adil
    	Adil
    		Adil
    			Adil
   					Adil""")   

}

---------------------------


fun main() {
    print("""
      Adil
    	
Adil	   Adil
    			
      Adil""")   

}


---------------------------

fun main() {
    //Array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)   
    //Array of Strings
	val words: Array<String> = arrayOf("Kotlin")
    //Array of squares using lambda function
    val squares = Array(5){i -> i * i}
}
