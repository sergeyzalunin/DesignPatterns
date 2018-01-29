package behavioral.visitor

interface IMessenger {
    fun receiveMessageFrom(messenger: SkypeMessage)
    fun receiveMessageFrom(messenger: TelegramMessage)
}