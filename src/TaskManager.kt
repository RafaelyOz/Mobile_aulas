class TaskManager {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
        println("Tarefa '${task.title}' adicionada com sucesso!")
    }

    fun listTasks() {
        if (tasks.isEmpty()) {
            println("Nenhuma tarefa cadastrada.")
        } else {
            tasks.forEachIndexed { index, task ->
                println("Tarefa ${index + 1}:\n$task\n")
            }
        }
    }

    fun completeTask(index: Int) {
        if (index in 0 until tasks.size) {
            tasks[index].completeTask()
            println("Tarefa '${tasks[index].title}' marcada como concluída!")
        } else {
            println("Índice inválido.")
        }
    }

    fun removeTask(index: Int) {
        if (index in 0 until tasks.size) {
            val removedTask = tasks.removeAt(index)
            println("Tarefa '${removedTask.title}' removida com sucesso!")
        } else {
            println("Índice inválido.")
        }
    }
}
