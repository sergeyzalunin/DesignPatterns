package behavioral.strategy

class StrategyProcessor{

    var baseStrategy: IStrategy?

    constructor() {
        this.baseStrategy = null
    }

    constructor(baseStrategy: IStrategy) {
        this.baseStrategy = baseStrategy
    }

    fun setStrategy(item: IStrategy) {
        baseStrategy = item
    }

    fun getStrategyName() : String {
        return baseStrategy!!.getStrategyName()
    }

    fun getStrategyName(call: () -> String): String {
        return call()
    }
}