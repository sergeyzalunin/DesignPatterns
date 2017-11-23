import Behavioral.Strategy.IStrategy
import Behavioral.Strategy.SomeStrategy1
import Behavioral.Strategy.SomeStrategy2
import Behavioral.Strategy.StrategyProcessor
import com.sun.org.apache.bcel.internal.generic.NEW
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test;

internal class StrategyProcessorTest {

    var processor = StrategyProcessor(SomeStrategy1());

    @AfterEach
    fun tearDown() {
        processor = StrategyProcessor(SomeStrategy1())
    }

    @Test
    fun getBaseStrategy() {
        assert(processor.baseStrategy is IStrategy)
    }

    @Test
    fun setBaseStrategy() {
        processor.baseStrategy = SomeStrategy2()
        assert(processor.baseStrategy is SomeStrategy2)
    }

    @Test
    fun setStrategy() {
        processor.setStrategy(SomeStrategy2())
        assert(processor.baseStrategy is SomeStrategy2)
    }

    @Test
    fun getStrategyName() {
        assert(processor.getStrategyName() == "Strategy #1")
    }

    @Test
    fun runStrategyTests() {
        assert(processor.getStrategyName() == "Strategy #1")

        processor.setStrategy(SomeStrategy2());
        assert(processor.getStrategyName() == "Strategy #2")
    }

    @Test
    fun runStrategyAsAnonymousMethodTests() {

        var name = StrategyProcessor().getStrategyName(fun(): String {
            var subprocessor = StrategyProcessor(SomeStrategy2())
            return subprocessor.getStrategyName();
        });
        assert(name == "Strategy #2")
    }
}