package collections

fun main() {
    val collection = listOf(1,2,3,4,5)

    println("Min = ${min(collection)}")
    println("Max = ${max(collection)}")
}

fun max(num: List<Int>): Int{
    var max = num.first()
    num.forEach {
        if (it > max){
            max = it
        }
    }
    return max
}

fun min(num: List<Int>): Int{
    var min = num.first()
    num.forEach {
        if (it < min){
            min = it
        }
    }
    return min
}