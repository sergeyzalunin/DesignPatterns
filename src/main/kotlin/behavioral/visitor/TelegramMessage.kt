package behavioral.visitor


class TelegramMessage(message: String) : MessageAggregator() {

    var lastMessage: String = message

    override fun sendMessageTo(messenger: IMessenger) {
        messenger.receiveMessageFrom(this);
    }
}