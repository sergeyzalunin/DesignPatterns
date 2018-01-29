package behavioral.visitor

class SkypeMessage(message: String) : MessageAggregator() {

    var lastMessage: String = message

    override fun sendMessageTo(messager: IMessager) {
        messager.reciveMessageFrom(this);
    }
}