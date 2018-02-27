package structural.adapter

import org.junit.Assert.*
import org.junit.Test

class AdapterTest {

    private val skypeMessenger = SkypeMessenger()
    private val currentMessenger = CurrentMessenger()

    @Test
    fun getMessageFromCurrentMessenger() {
        assertEquals(currentMessenger.read(), "Current messenger")
    }

    @Test
    fun adapteeMessageFromSkype() {
        val adapter = SkypeToCurrentMessengerAdapter(skypeMessenger)
        assertEquals(adapter.read(), "Skype messenger")
    }
}