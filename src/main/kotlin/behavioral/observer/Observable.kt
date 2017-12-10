package behavioral.observer

interface Observable {
    fun registerObserver(obj: Observer)
    fun removeObserver(obj: Observer)
    fun notifyObservers()
}