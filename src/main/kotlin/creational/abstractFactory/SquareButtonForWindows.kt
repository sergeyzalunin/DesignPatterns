package creational.abstractFactory

class SquareButtonForWindows : ISquareButton {

    override fun getCaption() : String {
        return "Square button for Windows"
    }
}