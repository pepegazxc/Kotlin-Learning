package functions

fun main() {
    println("Enter you name")
    
    val name = readln()
    
    greating(name)
}

fun greating(name:  String): Unit{
    println("Hello $name")
}