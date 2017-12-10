package behavioral.observer

class Messenger: Observable {

    private var message: String = ""
    private var observerList: ArrayList<Observer> = ArrayList<Observer>()

    override fun registerObserver(obj: Observer) {
        observerList.add(obj)
    }

    override fun removeObserver(obj: Observer) {
        observerList.remove(obj)
    }

    override fun notifyObservers() {
        var i: Int = 0
        while (observerList.size > i) {
            observerList[i++].update(message)
        }
        message = ""
    }

    fun set(message: String) {
        this.message = message
        notifyObservers()
    }

    fun observersCount(): Int {
        return observerList.size
    }
}