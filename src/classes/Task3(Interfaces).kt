package classes

interface Workable {
    fun work(): String
}

class Employee(val a: String ) : Workable {
    override fun work(): String {
        return "Employee is works on $a"
    }
}

fun main() {
    println("Enter where you want to work")
    val a = readln()

    print(Employee(a).work())
}