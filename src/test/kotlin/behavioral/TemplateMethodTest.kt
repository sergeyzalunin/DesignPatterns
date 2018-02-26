package Tests

import behavioral.templateMethod.SomeChild1
import behavioral.templateMethod.SomeChild2
import org.junit.Test

internal class TemplateMethodTest {

    @Test
    fun calculateSomeChild1() {
        var obj = SomeChild1()
        assert(obj.calculate() == 5)
    }

    @Test
    fun calculateSomeChild2() {
        var obj = SomeChild2()
        assert(obj.calculate() == 15)
    }

}