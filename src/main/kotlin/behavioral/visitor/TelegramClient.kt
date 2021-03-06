package behavioral.visitor

class TelegramClient : IMessenger {

    lateinit var lastMessage: String

    override fun receiveMessageFrom(messenger: SkypeMessage) {
        lastMessage = messenger.lastMessage
    }

    override fun receiveMessageFrom(messenger: TelegramMessage) {
        lastMessage = messenger.lastMessage
    }
}