import StoreProject.TasksTracker

fun main() {
    println("Hello\n" +
            "Please, choose action:")

    while (true) {
        print("1. Add new tasks to tracker\n"+
                "2. Show your tasks\n" +
                "3. Delete tasks\n" +
                "4. Show all tasks\n" +
                "0. Leave the program\n")
        val action = readln()
        when (action) {
            "1" -> {
                addTasks()
            }
            "2" -> {
                showTasks()
            }
            "3" -> {
                deleteTasks()
            }
            "4" -> {
                showAllTasks()
            }
            "0" -> break
            else -> println("Invalid action")
        }
    }
}
fun addTasks(): Unit{
    println("Add tasks and key to your tasks")
    val value: String = readln()
    val key: String = readln()
    println(TasksTracker.addNewTask(key, value))
}
fun showTasks(): Unit{
    println("Enter key")
    val key = readln()
    println(TasksTracker.showTasks(key))
}
fun showAllTasks(): Unit = println(TasksTracker.showAllTasks())

fun deleteTasks(): Unit{
    println("Enter key to delete task")
    val key: String = readln()
    println(TasksTracker.deleteTask(key))
}
