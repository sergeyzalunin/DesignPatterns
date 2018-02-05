package behavioral.state

import org.junit.Before
import org.junit.Test

class StateTest {

    lateinit var message: Message

    @Before
    fun prepareTest() {
        message = Message(CreateState())
    }

    @Test
    fun createdMessageTest() {
        val state = CreateState()
        message.send()
        assert(message.statusText == state.deliveryText)
        message.receive()
        assert(message.statusText == state.receiveText)
        message.delete()
        assert(message.statusText == state.deleteText)
    }
}