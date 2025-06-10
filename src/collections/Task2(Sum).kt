package collections

fun main() {
    val collection = listOf(1,2,3,4,5)

    println("Sum = ${sum(collection)}")
}

fun sum(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}