package behavioral.observer

class Contact(var name: String): Observer {

    private var message: String = ""

    fun getMessage(): String {
        return message
    }

    override fun update(message: String) {
        this.message = message
    }
}