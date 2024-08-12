class Task(val title: String, val description: String) {
    var isCompleted : Boolean = false

    fun completeTask(){
        isCompleted = true
    }

    override fun toString(): String {
        val status = if (isCompleted)
            "Concluida" else "Pendente"
        return "Tarefa: $title\nDescrição: $description\nStatus: $status"
    }
}