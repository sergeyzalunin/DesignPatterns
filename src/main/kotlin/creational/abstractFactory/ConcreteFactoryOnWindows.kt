package creational.abstractFactory

class ConcreteFactoryOnWindows : AbstractFactoryForOS {

    override fun createCircleButton(): ICircleButton {
        return CircleButtonForWindows()
    }

    override fun createSquareButton(): ISquareButton {
        return SquareButtonForWindows()
    }
}