package behavioral.observer

import org.junit.Test

import org.junit.Assert.*

class ObserverTest {

    @Test
    fun update() {

        var message: String = "some message"

        var contact: Contact = Contact("Test")
        contact.update(message)

        assert(contact.getMessage() == message)
    }
}