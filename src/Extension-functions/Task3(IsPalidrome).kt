package `Extension-functions`

fun main() {
        println("Enter String")
    val string = readln()
    print(string.isPalidrome())
}

fun String.isPalidrome(): Boolean {
    var start = 0
    var end =  this.length - 1
    while (start < end) {
        if (this[start] != this[end]) {
            return false
        }
        start++
        end--
    }
    return true
}