package creational.factoryMethod

import creational.factoryMethod.polymorphicFactoryMethod.ConcretePolymorphicFactoryA
import creational.factoryMethod.polymorphicFactoryMethod.ConcretePolymorphicFactoryB
import creational.factoryMethod.polymorphicFactoryMethod.IFactory
import org.junit.Assert.*
import org.junit.Test

class PolymorphicFactoryTest {

    lateinit var factory: IFactory

    @Test
    fun factoryATest() {
        factory = ConcretePolymorphicFactoryA()
        val product = factory.getProduct()
        assertEquals(product.getCaption(), "ProductA")
    }

    @Test
    fun factoryBTest() {
        factory = ConcretePolymorphicFactoryB()
        val product = factory.getProduct()
        assertEquals(product.getCaption(), "ProductB")
    }
}