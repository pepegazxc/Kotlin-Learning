package functions

fun main() {
    println("Enter number")

    val number = readln().toInt()

    if (isEvenNumber(number)) {
        println("YES, number is even")
    }else{
        println("NO, number is not even")
    }
}

fun isEvenNumber(a: Int): Boolean {
    if (a % 2 == 0){
        return true
    }else{
        return false
    }
}