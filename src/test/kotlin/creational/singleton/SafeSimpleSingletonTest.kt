package creational.singleton

class SafeSimpleSingletonTest : SingletonTemplateTestMethod() {

    override fun getInstance(): Long {
        return SafeSimpleSingleton.instance()
    }
}