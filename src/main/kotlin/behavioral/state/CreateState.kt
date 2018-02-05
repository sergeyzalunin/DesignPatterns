package behavioral.state

class CreateState : IMessageState {

    val deliveryText = "New message delivering now"
    val receiveText = "New message receiving now"
    val deleteText = "New message deleting now"

    override fun deliveryMessage(message: Message) {
        message.statusText = deliveryText
        message.state = DeliveryState()
    }

    override fun receiveMessage(message: Message) {
        message.statusText = receiveText
        message.state = ReceiveState()
    }

    override fun deleteMessage(message: Message) {
        message.statusText = deleteText
        message.state = DeleteState();
    }
}