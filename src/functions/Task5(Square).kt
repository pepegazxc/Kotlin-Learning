package functions

fun main() {
    println("Enter number")

    val number = readln().toInt()

    println("square of number $number = ${square(number)}")
}
fun square(number: Int): Int {
    return number * number
}