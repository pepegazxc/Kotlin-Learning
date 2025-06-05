package `if-else`

fun main() {
    println("Enter password")

    val password = readlnOrNull()

    val answer = if (password?.length!! <= 8 && password?.length!! >= 1) "weak" else if (password?.length!! >= 8) "strong" else "your password can not be null"

    println(answer)
}