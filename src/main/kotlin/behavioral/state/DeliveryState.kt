package behavioral.state

class DeliveryState : MessageState {

    constructor() {
        deliveryText = "Message was delivered. Switch to ReceiveState"
        receiveText = "Message was received. Switch to DeliveryState"
        deleteText = "Delete message"
    }
    override fun deliveryMessage(message: Message) {
        message.statusText = deliveryText
        message.state = ReceiveState()
    }

    override fun receiveMessage(message: Message) {
        message.statusText = receiveText
        message.state = DeliveryState()
    }
}