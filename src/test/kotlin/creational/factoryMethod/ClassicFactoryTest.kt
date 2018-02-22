package creational.factoryMethod

import creational.factoryMethod.classicFactoryMethod.ConcreteClassicFactoryA
import creational.factoryMethod.classicFactoryMethod.ConcreteClassicFactoryB
import org.junit.Test
import kotlin.test.assertEquals

class ClassicFactoryTest {

    @Test
    fun factoryATest() {
        var creator =  ConcreteClassicFactoryA()
        creator.anOperation()
        assertEquals(creator.productCaption, "ProductA")
    }

    @Test
    fun factoryBTest() {
        var creator =  ConcreteClassicFactoryB()
        creator.anOperation()
        assertEquals(creator.productCaption, "ProductB")
    }
}