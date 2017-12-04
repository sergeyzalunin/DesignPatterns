package behavioral.iterator

class SomeList: List() {

    var _innerList: MutableList <Any> = arrayListOf()

    override fun createIterator(): Iterator {
        return ConcreteIterator(this)
    }

    override fun getCount(): Int {
        return _innerList.size
    }

    override fun get(index: Int): Any {
        return _innerList[index]
    }

    override fun set(index: Int, value: Any) {
        _innerList.add(index, value)
    }
}