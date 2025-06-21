package `Null-Safety`

fun main() {
    println("Enter string (it might be null)")

    val string: String? = readln()

    println(upperCaseIfNotNull(string))
}

fun upperCaseIfNotNull(string: String?) : String?{
    return string?.uppercase() ?: null
}