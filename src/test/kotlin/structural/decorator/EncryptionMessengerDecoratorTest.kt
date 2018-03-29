package structural.decorator

import org.junit.Test

import org.junit.Assert.*

class EncryptionMessengerDecoratorTest {

    companion object {
        var messenger = EncryptionMessengerDecorator(Messenger())
    }

    @Test
    fun sendMessage() {
        messenger.sendMessage("Test");
        assertEquals(messenger.getLastMessage(), "Pawp")
    }

    @Test
    fun getMessage() {
        assertEquals(messenger.getMessage(), "Test")
    }
}