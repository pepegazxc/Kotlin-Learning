package `scope-fun`

fun main() {
    val result = with(StringBuilder()) {
        append("Hello, ")
        append("Kotlin!")
        toString()
    }
    println(result)
}