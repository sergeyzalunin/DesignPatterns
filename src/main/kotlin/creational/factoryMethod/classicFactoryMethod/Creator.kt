package creational.factoryMethod.classicFactoryMethod

import creational.factoryMethod.IProduct

abstract class Creator {

    lateinit var productCaption: String

    fun anOperation() {
        //Doing something with product
        productCaption = getProduct().getCaption()
    }

    abstract fun getProduct() : IProduct
}