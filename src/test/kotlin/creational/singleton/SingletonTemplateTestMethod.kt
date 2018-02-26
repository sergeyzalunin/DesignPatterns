package creational.singleton

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.concurrent.thread
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
abstract class SingletonTemplateTestMethod {

    abstract fun getInstance(): Long

    @Test
    fun testSingleton1_InMultiThread() {

        thread(start = true) {
            val threadId = getInstance()
            assertEquals(threadId, Thread.currentThread().id)
        }
        Thread.sleep(50) //need that tests passed
    }

    @Test
    fun testSingleton2_AfterMultiThread() {
        val threadId = getInstance()
        assertNotEquals(threadId, Thread.currentThread().id)
    }
}
