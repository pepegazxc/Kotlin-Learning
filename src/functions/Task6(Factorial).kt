package functions

fun main() {
    println("Enter number")

    val number = readln().toInt()


    println("Factorial if number $number is ${factorial(number)}")
}

fun factorial(n: Int): Int {
    var factorial = 1
    var i = 1
    while(i <= n){
        factorial *= i
        i += 1
    }
    return factorial
}
