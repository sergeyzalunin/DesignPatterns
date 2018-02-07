package behavioral.state

abstract class MessageState {

    open var deliveryText: String = "message delivering"
    open var receiveText: String = "message receiving"
    open var deleteText: String = "message deleting"

    open fun deliveryMessage(message: Message) {
        message.statusText = deliveryText
        message.state = DeliveryState()
    }
    open fun receiveMessage(message: Message) {
        message.statusText = receiveText
        message.state = ReceiveState()
    }
    open fun deleteMessage(message: Message) {
        message.statusText = deleteText
        message.state = DeleteState()
    }
}