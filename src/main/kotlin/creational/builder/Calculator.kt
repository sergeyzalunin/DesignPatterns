package creational.builder

class Calculator {

    private var result: Int = 0

    fun add(value: Int) {
        result += value
    }

    fun minus(value: Int) {
        result -= value
    }

    fun multiply(value: Int) {
        result *= value
    }

    fun divide(value: Int) {
        result /= value
    }

    fun calculate() : Int {
        return result
    }
}