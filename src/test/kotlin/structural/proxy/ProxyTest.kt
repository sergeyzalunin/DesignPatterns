package structural.proxy

import org.junit.Test

import org.junit.Assert.*

class ProxyTest {

    @Test
    fun sendMessage() {
        var sub = ProxySubject()
        sub.sendMessage("Test")
        assertEquals(sub.innerMessage, "Pawp")
    }
}