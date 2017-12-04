package behavioral.iterator

abstract class Iterator {
    abstract fun getFirst(): Any?
    abstract fun getNext(): Any?
    abstract fun isDone(): Boolean
    abstract fun getCurrentItem(): Any?
}