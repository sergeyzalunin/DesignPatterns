package behavioral.state

import org.junit.Test

class CreateStateTest {

    val createdState = CreateState()
    val deliveredState = DeliveryState()
    val deletedState = DeleteState()

    @Test
    fun creatingMessageTest() {

        val message = Message(CreateState())

        message.send()
        assert(message.statusText == createdState.deliveryText)

        message.receive()
        assert(message.statusText == deliveredState.receiveText)

        message.delete()
        assert(message.statusText == deliveredState.deleteText)

        message.delete()
        assert(message.statusText == deletedState.deleteText)
    }

    @Test
    fun creatingReceiveMessageTest() {

        val message = Message(CreateState())
        message.receive()
        assert(message.statusText == createdState.receiveText)
    }

    @Test
    fun creatingDeleteMessageTest() {

        val message = Message(CreateState())
        message.delete()
        assert(message.statusText == createdState.deleteText)
    }
}