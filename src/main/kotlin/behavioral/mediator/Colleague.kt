package behavioral.mediator

abstract class Colleague(private var mediator: Mediator) {
    var lastMessage: String = ""

    fun send(message: String) {
        mediator.write(message, this)
    }

    fun notify(message: String) {
        lastMessage = message
        println(lastMessage)
    }
}