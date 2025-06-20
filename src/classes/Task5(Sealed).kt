package classes

sealed class AuthResult

data class Success(val userId: String) : AuthResult()
data class Error(val message: String) : AuthResult()
object Loading : AuthResult()

fun handleResult(result: AuthResult) {
    when (result) {
        is Success -> println("Добро пожаловать, пользователь №${result.userId}")
        is Error -> println("Ошибка авторизации: ${result.message}")
        Loading -> println("Загрузка, пожалуйста подождите...")
    }
}

fun main() {
    val result1: AuthResult = Loading

    println("Enter random user id")
    val userId: AuthResult = Success(readln())
    println("Enter random message")
    val message: AuthResult = Error(readln())

    handleResult(result1)
    handleResult(userId)
    handleResult(message)
}