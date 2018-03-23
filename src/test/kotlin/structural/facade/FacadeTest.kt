package structural.facade

import org.junit.Test

import org.junit.Assert.*

class FacadeTest {

    @Test
    fun getOperationAandB() {
        val facade = SomeFacade()
        assertEquals(facade.getOperationAandB(), 3)
    }

    @Test
    fun getOperationAandC() {
        val facade = SomeFacade()
        assertEquals(facade.getOperationAandC(), 4)
    }

    @Test
    fun getOperationAandBandC() {
        val facade = SomeFacade()
        assertEquals(facade.getOperationAandBandC(), 6)
    }
}