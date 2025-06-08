package functions

fun main() {
    println("Enter string")

    var string = readln()


    println("String = ${delete(string)}")
}

fun delete(string: String): String {
    val trimmed = string.replace(" ", "")
    return trimmed
}