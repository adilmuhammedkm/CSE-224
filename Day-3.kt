//Day-3
fun main() {
    //Array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)   
    //Array of Strings
	val words: Array<String> = arrayOf("Kotlin", "Java", "Python")
    //Array of squares using lambda function
    val squares = Array(5) {i -> i*i}
    val firstNumber = numbers[0]
    val secondNumber = numbers[1]
    println("First Number: $firstNumber")
    println("Second Number: $secondNumber")
}

---------------------------


fun main() {
    //Array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)   
    //Array of Strings
    val words: Array<String> = arrayOf("Kotlin", "Java", "Python")
    //Modifying
    words[0] = "Flutter"
    numbers[4] = 25
    println(numbers[4])
    println(words[0])
    for (num in numbers){
        println(num)
    }
    val _2dArray: Array<Array<Int>> = arrayOf(arrayOf(5, 6, 7), arrayOf(8, 9, 10))
    print(_2dArray[1][1])
}

---------------------------


fun main() {
    var a = "bye"
    var b: String = a as String
    println("Unsafe Casting Result: $b")
    val c: Int? = a as? Int
    println("safe Casting Result: $c")

}
