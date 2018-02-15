package creational.singleton

class LazySingleton {

    companion object {
        private var singleton: Lazy<Long> = lazy { Thread.currentThread().id }

        fun instance(): Long {
            return singleton.value
        }
    }
}