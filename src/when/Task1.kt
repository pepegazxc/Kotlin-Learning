package `when`

fun main() {
    val number = readln().toInt()
    when{
        number % 2 == 0 -> println("$number is even")
        else -> println("$number is odd")
    }
}