package behavioral.state

class Message (state: IMessageState) {

    var statusText: String = ""
    var state: IMessageState = state

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