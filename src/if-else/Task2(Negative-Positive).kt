package `if-else`

fun main() {
    println("Enter two numbers")

    val num1 = readln().toInt()
    val num2 = readln().toInt()

    if (num1 < 0 && num2 < 0) println("Both numbers is negative") else if (num1 < 0) println("Number $num1 is negative") else println("Number $num2 is negative")

}