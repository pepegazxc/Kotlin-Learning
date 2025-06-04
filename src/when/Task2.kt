package `when`

fun main(){
    val day = readln().toInt()

    val dayIs = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Please enter the right number of day"
    }

    println(dayIs)
}