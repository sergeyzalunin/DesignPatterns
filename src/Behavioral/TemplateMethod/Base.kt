package Behavioral.TemplateMethod

abstract class Base {

    var x: Int = 0
    var y: Int = 0

    abstract fun setX()
    abstract fun setY()

    //A template method
    fun calculate(): Int  {
        setX();
        setY();
        return x + y;
    }
}