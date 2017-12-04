package behavioral.iterator

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class IteratorTest {

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
    fun getFirst() {
        var iterator = numbersList.createIterator()
        assert(iterator.getFirst() == 1)
    }

    @Test
    fun getNext() {
        var iterator = numbersList.createIterator()
        var i = 0
        while(i < numbersSize)
            assert(iterator.getNext() == ++i)
    }

    @Test
    fun isDone() {
        var iterator = numbersList.createIterator()
        var i = 1
        while(iterator.isDone())
            assert(iterator.getNext() == i++)
    }

    @Test
    fun getCurrentItem() {
        var iterator = numbersList.createIterator()
        var i = 1
        while(iterator.isDone())
            assert(iterator.getCurrentItem() == i++)
    }

}