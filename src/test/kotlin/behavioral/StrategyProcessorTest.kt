package behavioral

import behavioral.strategy.IStrategy
import behavioral.strategy.SomeStrategy1
import behavioral.strategy.SomeStrategy2
import behavioral.strategy.StrategyProcessor
import org.junit.Before
import org.junit.Test

class StrategyProcessorTest {

    var processor = StrategyProcessor(SomeStrategy1());

    @Before
    fun prepareTest() {
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