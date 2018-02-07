package behavioral.state

import org.junit.Test

class DeleteStateTest {

    val receivedState = ReceiveState()
    val deliveredState = DeliveryState()
    val deletedState = DeleteState()

    @Test
    fun deleteMessageTest() {

        val message = Message(DeleteState())

        message.send()
        assert(message.statusText == deletedState.deliveryText)

        message.receive()
        assert(message.statusText == deletedState.receiveText)

        message.delete()
        assert(message.statusText == deletedState.deleteText)

        message.delete()
        assert(message.statusText == deletedState.deleteText)
    }

    @Test
    fun receriveDeletedMessageTest() {

        val message = Message(DeleteState())

        message.receive()
        assert(message.statusText == deletedState.receiveText)
    }

    @Test
    fun deleteOnlyMessageTest() {

        val message = Message(DeleteState())

        message.delete()
        assert(message.statusText == deletedState.deleteText)
    }
}