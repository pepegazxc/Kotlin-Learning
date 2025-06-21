package `Null-Safety`

fun main(){
    println("Enter string (it might be null)")
    val string: String? = readln()

    print(safeLength(string))

}
fun safeLength(str: String?): Int {
    return str?.length ?: 0
}
