package creational.singleton

class SimpleSingleton {

    companion object {
        private var singleton: Long = 0L

        fun instance(): Long {
            if (singleton == 0L)
                singleton = Thread.currentThread().id
            return singleton
        }
    }
}