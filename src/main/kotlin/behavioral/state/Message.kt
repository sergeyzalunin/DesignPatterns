package behavioral.state

class Message (state: MessageState) {

    var statusText: String = ""
    var state: MessageState = state

    fun send() {
        this.state.deliveryMessage(this)
    }

    fun receive() {
        this.state.receiveMessage(this)
    }

    fun delete() {
        this.state.deleteMessage(this)
    }
}