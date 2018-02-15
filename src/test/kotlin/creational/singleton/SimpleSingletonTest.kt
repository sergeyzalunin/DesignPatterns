package creational.singleton

class SimpleSingletonTest : SingletonTemplateTestMethod() {

    override fun getInstance(): Long {
        return SimpleSingleton.instance()
    }
}