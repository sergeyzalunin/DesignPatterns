package structural.facade

class SomeFacade {

    fun getOperationAandB() : Int {
        val system1 =  SomeHeavySystem1()
        val system2 =  SomeHeavySystem2()
        return system1.getValueA() + system2.getValueB()
    }

    fun getOperationAandC() : Int {
        val system1 =  SomeHeavySystem1()
        val system3 =  SomeHeavySystem3()
        return system1.getValueA() + system3.getValueC()
    }

    fun getOperationAandBandC() : Int {
        val system1 =  SomeHeavySystem1()
        val system2 =  SomeHeavySystem2()
        val system3 =  SomeHeavySystem3()
        return system1.getValueA() + system2.getValueB() + system3.getValueC()
    }
}