package collections

fun main() {
    val collection = listOf(1,2,3,4,5,56,42,234,23,2,3,42,1)

    println("${delete(collection)}")
}

fun delete(collection: List<Int>): List<Int>{
    return collection.distinct()
}