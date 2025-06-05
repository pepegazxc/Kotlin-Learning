package `if-else`

fun main() {
    println("Enter your age: ")

    val age = readln().toInt()

    val answer = if (age <= 13 && age >= 0) "child" else if (age <= 17 && age >= 13) "teen" else if (age >= 18 && age <= 64) "adult" else if (age >= 65 && age <= 99) "senior" else if (age >= 100) "your dead" else "yor age cant be negative"

    println(answer)
}