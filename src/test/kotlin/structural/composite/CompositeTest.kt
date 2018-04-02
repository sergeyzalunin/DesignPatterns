package structural.composite

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CompositeTest {

    lateinit var pyramidSheme: PyramidComposite

    @Before
    fun prepareTest() {
        pyramidSheme = PyramidComposite("Pyramid")
        pyramidSheme.add(Employee("Empl1", 100.0))
        pyramidSheme.add(Employee("Empl2", 150.0))
        pyramidSheme.add(Employee("Empl3", 250.0))
    }

    @Test
    fun addToPyramid(){
        assertEquals(pyramidSheme.employeeList.size, 3)
    }

    @Test
    fun removeFromPyramid() {
        pyramidSheme.remove(pyramidSheme.employeeList.last())
        assertEquals(pyramidSheme.employeeList.size, 2)
    }

    @Test
    fun getNetSalary() {
        assertTrue(pyramidSheme.getNetSalary() == 500.0)
    }
}