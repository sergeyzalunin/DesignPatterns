package behavioral.command

import org.junit.Before
import org.junit.Test

class CommandTest {

    lateinit var receiver: MessengerReceiver
    lateinit var command: SendMessageCommand
    lateinit var invoker: MessengerInvoker

    @Before
    fun prepareTest() {
        receiver =  MessengerReceiver()
        command = SendMessageCommand(receiver)
        invoker = MessengerInvoker()
    }

    @Test
    fun sendMessageTest() {
        invoker.command = command
        invoker.sendMessage()
        assert(receiver.action.equals(ReceiverAction.RECEIVED))
    }

    @Test
    fun deleteMessageTest() {
        invoker.command = command
        invoker.deleteMessage()
        assert(receiver.action.equals(ReceiverAction.DELETED))
    }
}