package `while-loop`

fun main() {

    var number = 1
    var counter = 0

    while(number <= 100){
        if (number % 2 == 0){
            counter += number
        }

        number += 1
    }

    println(counter)
}