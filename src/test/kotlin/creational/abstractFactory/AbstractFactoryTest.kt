package creational.abstractFactory

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class AbstractFactoryTest {

    lateinit var factory: AbstractFactoryForOS

    @Test
    fun createCircleButtonForLinux() {
        factory = ConcreteFactoryOnLinux()
        var button =  factory.createCircleButton()
        assertEquals(button.getCaption(), "Circle button for Linux")
    }

    @Test
    fun createCircleButtonForWindows() {
        factory = ConcreteFactoryOnWindows()
        var button =  factory.createCircleButton()
        assertEquals(button.getCaption(), "Circle button for Windows")
    }

    @Test
    fun createSquareButtonForLinux() {
        factory = ConcreteFactoryOnLinux()
        var button =  factory.createSquareButton()
        assertEquals(button.getCaption(), "Square button for Linux")
    }

    @Test
    fun createSquareButtonForWindows() {
        factory = ConcreteFactoryOnWindows()
        var button =  factory.createSquareButton()
        assertEquals(button.getCaption(), "Square button for Windows")
    }
}