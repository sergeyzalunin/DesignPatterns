package creational.factoryMethod.polymorphicFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductA

class ConcretePolymorphicFactoryA : IFactory {

    override fun getProduct(): IProduct {
        return ProductA()
    }
}