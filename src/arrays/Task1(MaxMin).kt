package arrays

fun main() {
    // Fist
    println("Enter length of array")
    val array = IntArray(readln().toInt())
    println("Enter array")
    for (i in array.indices) {
        array[i] = readln().toInt()
    }
    println(array.joinToString(separator = " "))
    val maxNumber = array.max()
    val minNumber = array.min()
    println(maxNumber)
    println(minNumber)
    //Second
    println("Enter length of array")
    val array2 = IntArray(readln().toInt())
    println("Enter array")
    for (i in array2.indices) {
        array2[i] = readln().toInt()
    }
    var max = array2[0]
    for (i in array2) {
        if (max <= array2[i -1]){
            max = array2[i -1]
        }
    }
    println(max)
    var min = array2[0]
    for (i in array2){
        if (min >= array2[i -1]){
            min = array2[i  -1]
        }
    }
    println(min)
}