package `scope-fun`

fun main() {
    val list = mutableListOf(1,2,3,4,5).also {
        println("Adding $it")
    }.map { it * 2}

    println(list)
}