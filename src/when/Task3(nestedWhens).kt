package `when`

fun main() {
    println("Enter  first number")
    val firstNumber = readln().toInt()
    println("Enter  second number")
    val secondNumber = readln().toInt()
    println("Enter sign")
    val sign = readln()

    val answer = when (sign) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> when(secondNumber) {
            0 -> "You cant use this operator"
            else -> firstNumber / secondNumber
        }
        "%" -> when(secondNumber) {
            0 -> "You cant use this operator"
            else -> firstNumber % secondNumber
        }
        else -> "You cant use this operator"
    }

    println(answer)
}