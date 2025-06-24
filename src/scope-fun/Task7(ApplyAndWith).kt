package `scope-fun`

fun main() {
    val newPerson = Person().apply{
        name = "Kotlin"
        age = 10
    }
    with(newPerson) {
        println(this)
    }
}

data class Person(var name: String = "", var age: Int= 0)