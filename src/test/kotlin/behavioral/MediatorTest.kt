package behavioral

import behavioral.mediator.ConcreteCollegue1
import behavioral.mediator.ConcreteCollegue2
import behavioral.mediator.ConcreteMediator
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import kotlin.test.expect

class MediatorTest {

    var messageForCollegue1 = "message from collegue2 to collegue1"
    var messageForCollegue2 = "message from collegue1 to collegue2"
    var mediator = ConcreteMediator();
    var collegue1 = ConcreteCollegue1(mediator)
    var collegue2 = ConcreteCollegue2(mediator)

    @Before
    fun prepareTest() {
        mediator = ConcreteMediator()
        collegue1 = ConcreteCollegue1(mediator)
        collegue2 = ConcreteCollegue2(mediator)
    }

    @Test
    fun directCall() {

        mediator.collegue1 = collegue1
        mediator.collegue2 = collegue2

        collegue1.send(messageForCollegue2)
        collegue2.send(messageForCollegue1)

        assert(collegue2.lastMessage == messageForCollegue2)
        assert(collegue1.lastMessage == messageForCollegue1)
    }

    @Test(expected = UninitializedPropertyAccessException::class)
    fun didNotSetSecondCollegue() {

        mediator.collegue1 = collegue1
        collegue1.send(messageForCollegue2)
    }
}