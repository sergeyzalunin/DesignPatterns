package Behavioral.TemplateMethod

class SomeChild2: Base() {
    override fun setY() {
        x = 5
    }

    override fun setX() {
        y = 10
    }
}