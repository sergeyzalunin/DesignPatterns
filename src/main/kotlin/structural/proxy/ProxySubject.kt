package structural.proxy
import common.xor

class ProxySubject: Subject {

    private var subject: Lazy<RealSubject> = lazy { RealSubject() }

    var innerMessage: String = ""
        get() { return subject.value.innerMessage }

    override fun sendMessage(message: String) {
        subject.value.sendMessage(message.xor(message.length))
    }
}