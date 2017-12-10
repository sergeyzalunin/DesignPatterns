package behavioral.observer

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class ObservableTest {

    private var superMessenger: Messenger = Messenger()
    private var contact: Contact = Contact("Test")

    @Test
    fun registerObserver() {
        superMessenger.registerObserver(contact)
        assert(superMessenger.observersCount() == 1)
    }

    @Test
    fun removeObserver() {
        superMessenger.removeObserver(contact)
        assert(superMessenger.observersCount() == 0)
    }

    @Test
    fun notifyObservers() {

        var notify: String = "notify from messanger";
        var contact1 = Contact("Contact1")
        var contact2 = Contact("Contact2")
        var contact3 = Contact("Contact3")

        superMessenger.registerObserver(contact1)
        superMessenger.registerObserver(contact2)
        superMessenger.registerObserver(contact3)

        superMessenger.set(notify)

        assert(contact1.getMessage() == notify &&
                contact2.getMessage() == notify &&
                contact3.getMessage() == notify)
    }
}