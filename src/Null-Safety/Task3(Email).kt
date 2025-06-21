package `Null-Safety`

fun main() {
    println("Enter email (it might be null): ")
    val email: String? = readln()
    val email2: String? = null
    println(checkEmail(email2))
}

fun checkEmail(email: String?): String{
    return email  ?: "default@email.com"
}