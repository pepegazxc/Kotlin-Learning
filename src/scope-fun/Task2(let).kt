package `scope-fun`

fun main(){
    val str: String? = "Kotlin"

    pintReversed(str)
}

fun pintReversed(str: String?){
    str?.let {println(it.reversed())}
}