import kotlin.math.sqrt

fun main(args: Array<String>) {
    Wonders()
    println(sqrt(45.20))
    myFunction("Drill", "Titan",21)
    myFunction("Bree", "Mwangi",18)
    myFunction("Owoko", "Moses", 18)
    anotherone()
}
fun myFunction(fname: String, lname: String, age: Int) {
    println("My name is $fname $lname and I'm $age years old")
}
fun anotherone(){
    val num= 8
    val num1=2
    println("The product is ${num * num1}")
}