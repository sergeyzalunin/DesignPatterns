package creational.factoryMethod.staticFactoryMethod

import creational.factoryMethod.IProduct
import creational.factoryMethod.ProductA

class ConcreteStaticFactoryA {

    companion object {
        fun getProduct(): IProduct {
            return ProductA()
        }
    }
}