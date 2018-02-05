package behavioral.state

interface IMessageState {
    fun deliveryMessage(message: Message)
    fun receiveMessage(message: Message)
    fun deleteMessage(message: Message)
}