package creational.builder

class Director {

    private val builder = Calculator()

    fun addTwo() : Int {
        builder.add(2)
        return builder.calculate()
    }

    fun minusTwo() : Int {
        builder.minus(2)
        return builder.calculate()
    }

    fun multiplyOnTwo() : Int {
        builder.multiply(2)
        return builder.calculate()
    }

    fun divideOnTwo() : Int {
        builder.divide(2)
        return builder.calculate()
    }
}