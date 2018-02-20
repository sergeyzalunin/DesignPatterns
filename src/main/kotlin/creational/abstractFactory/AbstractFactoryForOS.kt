package creational.abstractFactory

interface AbstractFactoryForOS {
    fun createCircleButton(): ICircleButton
    fun createSquareButton(): ISquareButton
}