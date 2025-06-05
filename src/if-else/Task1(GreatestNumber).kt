package `if-else`

fun main() {

    println("Enter two numbers")

    val num1 = readln().toInt()
    val num2 = readln().toInt()

    if (num1 > num2) println("$num1 is greater") else println("$num2 is greater")

}