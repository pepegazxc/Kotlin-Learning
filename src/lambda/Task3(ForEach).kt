package lambda

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    myForEach(list , {list -> print(list + list)})
}

fun <T> myForEach(list: List<T>, action: (T) -> Unit) {
    for (item in list) {
        action(item)
    }
}
