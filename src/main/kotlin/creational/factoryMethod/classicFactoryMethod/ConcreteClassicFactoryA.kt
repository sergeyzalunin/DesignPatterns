package creational.factoryMethod.classicFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductA

class ConcreteClassicFactoryA : Creator() {

    override fun getProduct(): IProduct {
        return ProductA()
    }
}