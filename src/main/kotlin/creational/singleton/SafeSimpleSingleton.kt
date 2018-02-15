package creational.singleton

class SafeSimpleSingleton {

    companion object {
        private val threadId = Thread.currentThread().id

        fun instance(): Long {
            return threadId
        }
    }
}