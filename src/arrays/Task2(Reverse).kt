package arrays

fun main() {
    println("Enter length of array")
    val array = IntArray(readln().toInt())
    println("Enter array")
    for (i in array.indices) {
        array[i] = readln().toInt()
    }
    var reversedArray = Array<Int>(0){0}
    for (i in array.reversed()) {
        reversedArray += array[i-1]
    }
    print(reversedArray.joinToString(separator = ","))
}