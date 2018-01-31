package behavioral.command

interface ICommand {
    fun doCommand()
    fun undoCommand()
}