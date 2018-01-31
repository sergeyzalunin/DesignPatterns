package behavioral.command

class SendMessageCommand(receiver: MessengerReceiver) : ICommand {

    var receiver: MessengerReceiver = receiver

    override fun doCommand() {
        receiver.getMessage();
    }

    override fun undoCommand() {
        receiver.deleteMessage();
    }
}