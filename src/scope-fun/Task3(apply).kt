package `scope-fun`

data class User(var name: String = "", var age: Int = 0)

val user = User().apply {
    name = "Kotlin"
    age = 10
}