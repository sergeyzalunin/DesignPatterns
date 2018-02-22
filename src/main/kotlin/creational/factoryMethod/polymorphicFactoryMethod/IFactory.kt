package creational.factoryMethod.polymorphicFactoryMethod

import creational.factoryMethod.IProduct

interface IFactory {
    fun getProduct() : IProduct
}