package structural.proxy

class RealSubject : Subject {

    var innerMessage: String = ""

    override fun sendMessage(message: String) {
        this.innerMessage = message
    }
}