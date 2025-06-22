package `Extension-functions`

fun main() {
    println("Enter String")
    val string = readln()

    print(string.trimAndLower())
}

fun String.trimAndLower(): String {
    return this.replace(" ", "").lowercase()
}