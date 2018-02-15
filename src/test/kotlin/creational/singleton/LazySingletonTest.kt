package creational.singleton

class LazySingletonTest : SingletonTemplateTestMethod() {

    override fun getInstance(): Long {
        return LazySingleton.instance()
    }
}