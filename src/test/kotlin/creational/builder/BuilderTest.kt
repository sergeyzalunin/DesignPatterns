package creational.builder

import org.junit.Test
import org.junit.Assert.*


class BuilderTest {

    @Test
    fun addTest() {
        val builder = Calculator()
        builder.add(1)
        builder.add(1)
        assertEquals(builder.calculate(), 2)
    }

    @Test
    fun minusTest() {
        val builder = Calculator()
        builder.add(1)
        builder.minus(1)
        assertEquals(builder.calculate(), 0)
    }

    @Test
    fun multiplyTest() {
        val builder = Calculator()
        builder.add(3)
        builder.minus(1)
        builder.multiply(2)
        assertEquals(builder.calculate(), 4)
    }

    @Test
    fun divideTest() {
        val builder = Calculator()
        builder.add(3)
        builder.minus(1)
        builder.multiply(2)
        builder.divide(2)
        assertEquals(builder.calculate(), 2)
    }

    @Test(expected =  ArithmeticException::class)
    fun divideOnZeroTest() {
        val builder = Calculator()
        builder.add(4)
        builder.divide(0)
        assertEquals(builder.calculate(), 0)
    }
}