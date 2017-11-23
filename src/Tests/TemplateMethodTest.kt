package Tests

import Behavioral.TemplateMethod.SomeChild1
import Behavioral.TemplateMethod.SomeChild2
import org.junit.jupiter.api.Test

internal class TemplateMethodTest {

    @Test
    fun calculateSomeChild1() {
        var obj = SomeChild1();
        assert(obj.calculate() == 5)
    }

    @Test
    fun calculateSomeChild2() {
        var obj = SomeChild2();
        assert(obj.calculate() == 15)
    }

}