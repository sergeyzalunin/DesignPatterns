package structural.decorator

class Messenger : IMessenger {

    private var lastmessage: String = "" //variable used for testing

    override fun sendMessage(message: String) {
        lastmessage = message;
    }

    override fun getMessage(): String {
        return lastmessage;
    }

    override fun getLastMessage(): String {
        return lastmessage;
    }
}