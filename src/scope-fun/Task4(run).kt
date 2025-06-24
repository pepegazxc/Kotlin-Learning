package `scope-fun`

fun main() {
    val result = 4.run {
        val square = this * this
        print("$square")
    }
}