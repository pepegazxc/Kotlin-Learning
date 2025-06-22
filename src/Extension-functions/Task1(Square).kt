package `Extension-functions`


fun main (){
    println("Enter number: ")
    val num = readln().toInt()

    println(num.square(num))
}

fun Int.square(num: Int): Int{
    return this*this
}