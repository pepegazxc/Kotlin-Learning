fun main() {
    println("Enter your age, name and university")
    var age = readln().toInt()
    var university = readln()
    var name = readln()

    println(Student(name, age, university).introduce())
}

open class Person(var name: String, var age: Int) {
    open fun introduce(): String {
        return "Меня зовут $name, мне $age лет."
    }
}


class Student(name: String, age: Int, var university: String) : Person(name, age) {
    override fun introduce(): String {
        return super.introduce() + " Я учусь в университете: $university."
    }
}


