package creational.abstractFactory

class SquareButtonForLinux : ISquareButton {

    override fun getCaption() : String {
        return "Square button for Linux"
    }
}