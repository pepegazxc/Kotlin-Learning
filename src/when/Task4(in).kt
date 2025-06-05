package `when`

fun main() {
    println("Enter a score (0 - 100)")

    val score : Int = readln().toInt()

    when(score) {
        in 0..20 -> println("Your very bad")
        in 21..30 -> println("Your good")
        in 31..40 -> println("Your good")
        in 41..60 -> println("Your good")
        in 61..70 -> println("Your good")
        in 71..80 -> println("Your good")
        in 81..100 -> println("Your good")
        else -> println("Enter a number from 0 to 100")
    }
}