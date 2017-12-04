package behavioral.iterator

abstract class List {
    abstract fun createIterator(): Iterator
    abstract fun getCount(): Int
    abstract operator fun get(index: Int): Any
    abstract operator fun set(index: Int, value: Any)
}