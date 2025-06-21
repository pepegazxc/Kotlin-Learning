package `Null-Safety`

fun main( ) {
    println("Enter string")
    val string = readln()
    val string2: String? = null
    get(string2)
}

fun get(str: String?): Int {
    return str!!.length
}