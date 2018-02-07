package behavioral.state

class ReceiveState : MessageState {

    constructor() {
        deliveryText = "Message was received. Switch to ReceiveState"
        receiveText = "Message was delivered. Switch to DeliveryState"
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