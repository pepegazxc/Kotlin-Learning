package classes


fun main() {
    println("Which animal you want to hear")
    val choice = readln().trim().lowercase()

    when(choice) {
        "cat" -> println(Cat().makeSound())
        "dog" -> println(Dog().makeSound())
        else -> println("Unknown choice(cat or dog)")
    }

}

abstract class Animal {
    abstract fun makeSound(): String
}

class Cat : Animal() {
    override fun makeSound(): String {
        return "Meow"
    }
}

class Dog: Animal() {
    override fun makeSound(): String {
        return "Bark"
    }
}