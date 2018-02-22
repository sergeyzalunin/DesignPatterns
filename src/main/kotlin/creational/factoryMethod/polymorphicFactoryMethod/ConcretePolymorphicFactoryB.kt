package creational.factoryMethod.polymorphicFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductB

class ConcretePolymorphicFactoryB : IFactory {

    override fun getProduct(): IProduct {
        return ProductB()
    }
}