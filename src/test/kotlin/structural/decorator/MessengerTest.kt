package structural.decorator

import org.junit.Test

import org.junit.Assert.*

class MessengerTest {

    companion object {
        var messenger = Messenger()
    }

    @Test
    fun sendMessage() {
        messenger.sendMessage("Test");
        assertEquals(messenger.getLastMessage(), "Test")
    }

    @Test
    fun getMessage() {
        assertEquals(messenger.getMessage(), "Test")
    }
}