package behavioral.state

import org.junit.Test

class ReceiveStateTest {

    val receivedState = ReceiveState()
    val deliveredState = DeliveryState()
    val deletedState = DeleteState()

    @Test
    fun receiveMessageTest() {

        val message = Message(ReceiveState())

        message.send()
        assert(message.statusText == receivedState.deliveryText)

        message.receive()
        assert(message.statusText == receivedState.receiveText)

        message.delete()
        assert(message.statusText == deliveredState.deleteText)

        message.delete()
        assert(message.statusText == deletedState.deleteText)
    }

    @Test
    fun receiveOnlyMessageTest() {

        val message = Message(ReceiveState())

        message.receive()
        assert(message.statusText == receivedState.receiveText)
    }

    @Test
    fun receiveDeleteMessageTest() {

        val message = Message(ReceiveState())

        message.delete()
        assert(message.statusText == receivedState.deleteText)
    }
}