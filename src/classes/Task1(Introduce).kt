package classes

fun main() {
    println("Enter your person (age and name)")
    val age = readln().toInt()
    val name = readln()

    val p = Person(age, name)
    p.introduce()

}

open class Person(
    val age: Int,
    val name: String
) {

    fun introduce() {
        println("My name is $name and my age is $age")
    }

}