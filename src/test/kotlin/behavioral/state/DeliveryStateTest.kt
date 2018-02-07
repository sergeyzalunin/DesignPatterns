package behavioral.state

import org.junit.Test

class DeliveryStateTest {

    val receivedState = ReceiveState()
    val deliveredState = DeliveryState()
    val deletedState = DeleteState()

    @Test
    fun deliveryMessageTest() {

        val message = Message(DeliveryState())

        message.send()
        assert(message.statusText == deliveredState.deliveryText)

        message.receive()
        assert(message.statusText == receivedState.receiveText)

        message.delete()
        assert(message.statusText == receivedState.deleteText)

        message.delete()
        assert(message.statusText == deletedState.deleteText)
    }

    @Test
    fun deliveryReceiveMessageTest() {

        val message = Message(DeliveryState())

        message.receive()
        assert(message.statusText == deliveredState.receiveText)
    }

    @Test
    fun deliveryDeleteMessageTest() {

        val message = Message(DeliveryState())

        message.delete()
        assert(message.statusText == deliveredState.deleteText)
    }
}