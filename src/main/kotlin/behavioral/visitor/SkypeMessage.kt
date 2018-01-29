package behavioral.visitor

class SkypeMessage(message: String) : MessageAggregator() {

    var lastMessage: String = message

    override fun sendMessageTo(messenger: IMessenger) {
        messenger.receiveMessageFrom(this);
    }
}