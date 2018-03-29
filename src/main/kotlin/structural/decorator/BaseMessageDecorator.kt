package structural.decorator

abstract class BaseMessengerDecorator (private val messenger: IMessenger) : IMessenger {

    override fun sendMessage(message: String) {
        messenger.sendMessage(message)
    }

    override fun getMessage(): String {
        return messenger.getMessage()
    }

    override fun getLastMessage(): String {
        return messenger.getLastMessage()
    }
}