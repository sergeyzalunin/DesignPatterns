package creational.factoryMethod

import creational.factoryMethod.staticFactoryMethod.ConcreteStaticFactoryA
import creational.factoryMethod.staticFactoryMethod.ConcreteStaticFactoryB
import org.junit.Assert.*
import org.junit.Test

class StaticFactoryTest {

    lateinit var product: IProduct

    @Test
    fun factoryATest() {
        product = ConcreteStaticFactoryA.getProduct()
        assertEquals(product.getCaption(), "ProductA")
    }

    @Test
    fun factoryBTest() {
        product = ConcreteStaticFactoryB.getProduct()
        assertEquals(product.getCaption(), "ProductB")
    }
}