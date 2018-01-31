package behavioral.command

class MessengerReceiver {

    var action: ReceiverAction = ReceiverAction.NONE

    fun getMessage() {
        action = ReceiverAction.RECEIVED
    }

    fun deleteMessage() {
        action = ReceiverAction.DELETED
    }
}