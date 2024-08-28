//Day-7

fun sum(a:Int = 10,b:Int = 20) 
{
    //sum function
    val c = a + b
    println(c)
}
fun main()
{
    sum(20,50)
    sum()
}


---------------------------

fun sum(a:Int,b:Int) 
{
    //sum function with no values
    val c = a + b
    println(c)
}
fun main()
{
	sum(20,50)
// 	sum()	//This sum will produce an error since there is no values for parameters a and b
}


---------------------------

fun main()
{
    //Returning from a function
    val a = 10
    val b = 20
    val result = sum(a, b)
    print(result)
}
fun sum(a:Int,b:Int):Int
{
    
    val x = a + b
    return x
}


---------------------------

class Student
{
    //Class Student with function
    fun result()
    {
        println("Pending")
    }
}
fun main() {
    val s1 = Student()
    s1.result()
}
