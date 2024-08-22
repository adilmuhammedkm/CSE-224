//Day-4

fun main() {
    var a = 10
    var b = 5    
    //Arithmetic Operators
    val sum = a+b
    println("Sum of $a + $b = $sum")
    val mul = a*b
    println("Multiplication of $a * $b = $mul")
    val div = a/b
    println("Division of $a / $b = $div")
    val sub = a-b
    println("Subtraction of $a - $b = $sub")
    val rem = a%b
    println("Reminder of $a % $b = $rem")
}

---------------------------


fun main() {
    var a = 10
    var b = 5    
    //Relational Operator
    println("$a > $b = ${a > b}")
    println("$a < $b = ${a < b}")
    println("$a >= $b = ${a >= b}")
    println("$a <= $b = ${a <= b}")
    println("$a == $b: ${a == b}")
    println("$a != $b = ${a != b}")
}

---------------------------


fun main() {
    var a = 10
    var b = 5    
    //Assignment Operator
    a+=b
    println("After Add Assignment Operator: $a")
    b-=a
    println("After Sub Assignment Operator: $b")
    a*=b
    println("After Mul Assignment Operator: $a")
    a/=b
    println("After Div Assignment Operator: $a")
    a%=b
    println("After Rem Assignment Operator: $a")
}


---------------------------


fun main() {
    var a = 10
    var b = 5    
    //Unary Operator
    println("Unary Plus: ${+a}")
    println("Unary Minus: ${-a}")
    println("Increment by 1: ${++a}")
    println("Decrement by 1: ${--a}")
    println("Not: !$a")
}
