package creational.singleton

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class LockSingleton {

    companion object {
        private val locker: Lock = ReentrantLock()
        private var threadId: Long = 0L

        fun instance(): Long {
            if (threadId == 0L)
            {
                locker.withLock {
                    if (threadId == 0L)
                        threadId = Thread.currentThread().id
                }
            }
            return threadId
        }
    }
}