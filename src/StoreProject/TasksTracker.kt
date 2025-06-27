package StoreProject

object TasksTracker {
    private var listOfTasks = mutableMapOf<String, String>()

    fun addNewTask(key: String, value: String): String {
        listOfTasks[key] = value
        return "Task '$value' has been added with key '$key'"
    }

    fun showTasks(key: String): String = listOfTasks[key].orEmpty()

    fun deleteTask(key: String): String {
        listOfTasks.remove(key) ?: "you don't have this task"
        return "Your tasks with key '$key' has been deleted"
    }

    fun showAllTasks(): String = listOfTasks.values.joinToString(separator = "\n")
}