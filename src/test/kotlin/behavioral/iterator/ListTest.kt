package behavioral.iterator

import org.junit.Before
import org.junit.Test

class ListTest {

    lateinit var numbersList: SomeList
    var numbersSize: Int = 6

    @Before
    fun setUp() {
        numbersList = SomeList()
        var i = 0
        while (i < numbersSize)
            numbersList[i++] = i
    }

    @Test
    fun createIterator() {
        var iterator = numbersList.createIterator()
        assert(iterator.getFirst() == 1)
    }

    @Test
    fun getCount() {
        assert(numbersList.getCount() == 6)
    }

    @Test
    fun get() {
        var i = 0
        while (i < numbersSize)
            assert(numbersList[i++] == i)
    }

    @Test
    fun set() {
        var i = 0
        while (i < numbersSize) {
            numbersList[i] = i
            assert(numbersList[i] == i++)
        }
    }
}