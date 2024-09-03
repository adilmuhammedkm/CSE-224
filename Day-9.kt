 //Day-9

interface Shape
{
    //Interface in Kotlin
    fun area(): Double
}
open class Rectangle(val a: Double, val b: Double): Shape
{
    override fun area(): Double {
        return a * b
    }

    open fun display() {
        println("erea of rectangle with dimensions $a * $b is ${area()}")
    }
}

class Square(side: Double) : Rectangle(side, side) {
    override fun display() {
        println("erea of square with side $a is ${area()}")
    }
}

fun main() {
    val myRectangle = Rectangle(4.0, 5.0)
    myRectangle.display()
    val mySquare = Square(4.0)
    mySquare.display()
}
