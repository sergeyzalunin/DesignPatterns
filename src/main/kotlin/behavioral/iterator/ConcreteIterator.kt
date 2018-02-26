package behavioral.iterator

class ConcreteIterator(list: List): Iterator() {

    var _aggregate = list
    var _current: Int = -1

    override fun getFirst(): Any? {
        return _aggregate[0]
    }

    override fun getNext(): Any? {
        var result: Any? = null

        if (++_current < _aggregate.getCount()) {
            result = _aggregate[_current]
        }

        return result
    }

    override fun isDone(): Boolean {
        return _current >= _aggregate.getCount()
    }

    override fun getCurrentItem(): Any? {
        return _aggregate[_current]
    }
}