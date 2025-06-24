package `scope-fun`

fun main(){
    val name: String? = "Kotlin"
    name?.let{
        println("Length: ${it.length}")
    }
}