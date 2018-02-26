package behavioral.visitor

import org.junit.Test

class VisitorTest {

    @Test
    fun SkypeToSkypeTest() {

        var testMessage = "Message from Skype"
        var message = SkypeMessage(testMessage)
        var client = SkypeClient()
        message.sendMessageTo(client)
        assert(client.lastMessage == testMessage)
    }

    @Test
    fun TelegramToTelegramTest() {

        var testMessage = "Message from Telegram"
        var message = TelegramMessage(testMessage)
        var client = TelegramClient()
        message.sendMessageTo(client)
        assert(client.lastMessage == testMessage)
    }

    @Test
    fun SkypeToTelegramTest() {

        var testMessage = "Message from Skype to Telegram"
        var message = SkypeMessage(testMessage)
        var client = TelegramClient()
        message.sendMessageTo(client)
        assert(client.lastMessage == testMessage)
    }

    @Test
    fun TelegramToSkypeTest() {

        var testMessage = "Message from Telegram to Skype"
        var message = TelegramMessage(testMessage)
        var client = SkypeClient()
        message.sendMessageTo(client)
        assert(client.lastMessage == testMessage)
    }
}