package behavioral.visitor

interface IMessager {
    fun reciveMessageFrom(messager: SkypeMessage)
    fun reciveMessageFrom(messager: TelegramMessage)
}