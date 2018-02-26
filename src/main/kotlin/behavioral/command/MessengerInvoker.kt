package behavioral.command

class MessengerInvoker {

    lateinit var command: ICommand

    fun sendMessage() {
        command.doCommand()
    }

    fun deleteMessage() {
        command.undoCommand()
    }
}