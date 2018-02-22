package creational.factoryMethod.classicFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductB

class ConcreteClassicFactoryB : Creator() {

    override fun getProduct(): IProduct {
        return ProductB()
    }
}