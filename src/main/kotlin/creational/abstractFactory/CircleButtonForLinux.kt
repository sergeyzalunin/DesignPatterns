package creational.abstractFactory

class CircleButtonForLinux : ICircleButton {

    override fun getCaption() : String {
        return "Circle button for Linux"
    }
}