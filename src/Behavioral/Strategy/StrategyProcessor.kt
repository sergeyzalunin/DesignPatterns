package Behavioral.Strategy

import jdk.nashorn.internal.objects.NativeFunction.call

class StrategyProcessor{

    var baseStrategy: IStrategy?;

    constructor() {
        this.baseStrategy = null;
    }

    constructor(baseStrategy: IStrategy) {
        this.baseStrategy = baseStrategy;
    }

    fun setStrategy(item: IStrategy) {
        baseStrategy = item;
    }

    fun getStrategyName() : String {
        return baseStrategy!!.getStrategyName()
    }

    fun getStrategyName(call: () -> String): String {
        return call();
    }
}