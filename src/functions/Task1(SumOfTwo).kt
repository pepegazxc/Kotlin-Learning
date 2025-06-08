package functions

fun main() {
    println("Enter two numbers")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    val answer = sumOfTwo(num1, num2)
    println("The answer is $answer")
}


fun sumOfTwo(a: Int, b: Int): Int {
    return a+b
}