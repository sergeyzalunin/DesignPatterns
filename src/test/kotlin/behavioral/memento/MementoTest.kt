package behavioral.memento

import org.junit.Test
import kotlin.test.assertFails

class MementoTest {

    private val origin = TextOriginator()
    private val careTaker = TextCaretaker()

    @Test
    fun testMemento() {
        origin.text = "T"
        careTaker.save(origin.createTextMemento())
        origin.text = "Te"
        careTaker.save(origin.createTextMemento())
        origin.text = "Tes"
        careTaker.save(origin.createTextMemento())
        origin.text = "Test"
        careTaker.save(origin.createTextMemento())

        origin.restoreFromTextMemento(careTaker.getLast())
        assert(origin.text == "Test")
        origin.restoreFromTextMemento(careTaker.getLast())
        assert(origin.text == "Tes")
        origin.restoreFromTextMemento(careTaker.getLast())
        assert(origin.text == "Te")
        origin.restoreFromTextMemento(careTaker.getLast())
        assert(origin.text == "T")
    }

    @Test
    fun exceptionWhenEmptyMemento() {
        assertFails { origin.restoreFromTextMemento(careTaker.getLast()) }
    }
}