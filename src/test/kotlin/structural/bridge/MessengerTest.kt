package structural.bridge

import org.junit.Assert.*
import org.junit.Test

class MessengerTest {

    @Test
    fun sendStringToSkype() {
        val messenger : Messenger = SkypeMessenger()
        val message : Message = StringMessage()
        messenger.send(message)
        assertEquals(message.testMessage, "StringMessage from Skype")
    }

    @Test
    fun sendImageToSkype() {
        val messenger : Messenger = SkypeMessenger()
        val message : Message = ImageMessage()
        messenger.send(message)
        assertEquals(message.testMessage, "ImageMessage from Skype")
    }

    @Test
    fun sendStringToTelegram() {
        val messenger : Messenger = TelegramMessenger()
        val message : Message = StringMessage()
        messenger.send(message)
        assertEquals(message.testMessage, "StringMessage from Telegram")
    }

    @Test
    fun sendImageToTelegram() {
        val messenger : Messenger = TelegramMessenger()
        val message : Message = ImageMessage()
        messenger.send(message)
        assertEquals(message.testMessage, "ImageMessage from Telegram")
    }
}