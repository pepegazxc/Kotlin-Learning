package `for-loop`

fun main() {
    val array = arrayOf(1,2,7,4,5)

    var index = array.indexOf(1)

    for (i in array) {
        if (index < i) index = i else continue
    }

    println(index)
}