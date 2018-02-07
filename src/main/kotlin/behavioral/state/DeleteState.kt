package behavioral.state

class DeleteState : MessageState {

    constructor() {
        deliveryText = "Remove mine message"
        receiveText = "Remove not mine message"
        deleteText = "Message is deleted"
    }

    override fun deliveryMessage(message: Message) {
        message.statusText = deliveryText
        message.state = this
    }

    override fun receiveMessage(message: Message) {
        message.statusText = receiveText
        message.state = this
    }

    override fun deleteMessage(message: Message) {
        message.statusText = deleteText
        message.state = this
    }
}