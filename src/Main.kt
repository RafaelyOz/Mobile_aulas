fun main() {
    val taskManager = TaskManager()

    while (true) {
        println("\nEscolha uma opção:")
        println("1. Adicionar Tarefa")
        println("2. Listar Tarefas")
        println("3. Marcar Tarefa como Concluída")
        println("4. Remover Tarefa")
        println("5. Sair")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                println("Digite o título da tarefa:")
                val title = readLine().orEmpty()
                println("Digite a descrição da tarefa:")
                val description = readLine().orEmpty()

                val task = Task(title, description)
                taskManager.addTask(task)
            }

            2 -> taskManager.listTasks()

            3 -> {
                println("Digite o número da tarefa a ser marcada como concluída:")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1
                taskManager.completeTask(index)
            }

            4 -> {
                println("Digite o número da tarefa a ser removida:")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1
                taskManager.removeTask(index)
            }

            5 -> break

            else -> println("Opção inválida.")
        }
    }
}
