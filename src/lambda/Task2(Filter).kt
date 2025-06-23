package lambda

fun main() {
    println("Enter number in list")
    val len = readln().toInt()
    var list = listOf(len)

    print(filterList(list))

}

fun filterList(number: List<Int>): List<Int> {
    return number.filter { it >= 5 }
}