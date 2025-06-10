package collections

fun main() {
    val collection = (1..50).toList()
    println("Enter number")
    val num = readln().toInt()
    println("Check: ${check(num, collection)}")
}

fun check(num: Int, collection: List<Int>): Boolean {
    collection.forEach {
        if (it == num) return true
    }
    return false
}