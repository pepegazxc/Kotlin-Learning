package lambda

fun main(){
    println("Enter two numbers: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    print(sum(num1, num2, { num1, num2 -> num1 + num2 }))
}

fun sum(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}