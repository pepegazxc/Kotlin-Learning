package functions

fun main() {
    println("Enter two numbers")

    val number = readln().toInt()
    val number2 = readln().toInt()

    println("The a number is $number \n" +
            "The b number is $number2")

    println(maxOfTwo(number, number2))
}

fun maxOfTwo(a: Int, b: Int): Unit {
    if(a > b) {
        return println("a is greater than b")
    }else{
        return println("b is greater than a")
    }
}