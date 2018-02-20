package creational.abstractFactory

class ConcreteFactoryOnLinux : AbstractFactoryForOS {

    override fun createCircleButton(): ICircleButton {
        return CircleButtonForLinux()
    }

    override fun createSquareButton(): ISquareButton {
        return SquareButtonForLinux()
    }
}