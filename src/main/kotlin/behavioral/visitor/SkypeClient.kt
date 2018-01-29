package behavioral.visitor

class SkypeClient : IMessager {

    lateinit var lastMessage: String

    override fun reciveMessageFrom(messager: SkypeMessage) {
        lastMessage = messager.lastMessage;
    }

    override fun reciveMessageFrom(messager: TelegramMessage) {
        lastMessage = messager.lastMessage;
    }
}