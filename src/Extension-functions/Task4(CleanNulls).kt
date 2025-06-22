package `Extension-functions`

import java.util.Objects

fun main() {
    val a: List<Any?> = arrayListOf(1, null, null, 25, 30, null, "String", null, "Another String")

    println(a.cleanNulls())
}

fun List<Any?>.cleanNulls(): List<Any> {
    return this.filterNotNull()
}