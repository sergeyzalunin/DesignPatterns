package creational.builder

import org.junit.Test
import org.junit.Assert.*
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class DirectorBuilderTest {

    companion object {
        private var director = Director()
    }

    @Test
    fun addTwo() {
        assertEquals(director.addTwo(), 2)
    }

    @Test
    fun divideOnTwo() {
        assertEquals(director.divideOnTwo(), 1)
    }

    @Test
    fun minusTwo() {
        assertEquals(director.minusTwo(), -1)
    }

    @Test
    fun multiplyOnTwo() {
        assertEquals(director.multiplyOnTwo(), -2)
    }
}