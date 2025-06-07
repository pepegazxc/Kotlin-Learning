package arrays

import kotlin.random.Random.Default.nextInt

fun main() {
    println("Enter length of array")
    val array = IntArray(readln().toInt())
    println("Enter array")
    for (i in array.indices) {
        array[i] = readln().toInt()
    }
    println(array.joinToString(separator = " "))
    val temp = array.last()
    for (i in array.size - 1 downTo 1) {
        array[i] = array[i - 1]
    }
    array[0] = temp
    println(array.joinToString(separator = " "))
}