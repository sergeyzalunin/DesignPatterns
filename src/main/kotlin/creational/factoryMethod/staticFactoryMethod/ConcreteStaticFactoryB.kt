package creational.factoryMethod.staticFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductB

class ConcreteStaticFactoryB {

    companion object {
        fun getProduct() : IProduct {
            return ProductB()
        }
    }
}