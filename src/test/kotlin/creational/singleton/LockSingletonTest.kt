package creational.singleton

class LockSingletonTest : SingletonTemplateTestMethod() {

    override fun getInstance(): Long {
        return LockSingleton.instance()
    }
}