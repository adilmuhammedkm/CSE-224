//Practicework

fun main()
{
    //Celsius To Fahrenheit
    val C = 20.89
    celsiusTofahrenheit(C) 
}
fun celsiusTofahrenheit(Celsius: Double)
{
    println((Celsius*9/5)+32)
}


---------------------------

fun main()
{
    // Fahrenheit To Celsius
    val F = 200.89
    val result = fahrenheitTocelsius(F)
    print(result)
}
fun fahrenheitTocelsius(Fahreheit:Double):Double
{
    val C = (Fahreheit*5/9)-32
    return C
}


---------------------------


fun fact(n: Int): Int {
    //factorial function
    return if (n <= 1) 1 else n * fact(n - 1)
}

fun main() {
    val number = 10
    val result = fact(number)
    println("Factorial of $number = $result")
}

---------------------------

fun fib(n: Int): Int {
    //fibonacci function
    return if (n <= 1) n else fib(n - 1) + fib(n - 2)
}

fun main() {
    val number = 13
    val result = fib(number)
    println("Fibonacci of $number = $result")
}
