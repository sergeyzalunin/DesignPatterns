package behavioral.state

class DeleteState : IMessageState {

    override fun deliveryMessage(message: Message) {
        message.statusText = "Remove mine message"
        message.state = DeliveryState()
    }

    override fun receiveMessage(message: Message) {
        message.statusText = "Remove not mine message"
        message.state = ReceiveState()
    }

    override fun deleteMessage(message: Message) {
        message.statusText = "Message is deleted"
    }
}