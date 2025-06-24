package `scope-fun`

fun main(){

    val description = Book("Book", "Ya").run{
        println("Book $tilte, by $author")
    }

}

data class Book (val tilte: String , val author: String)