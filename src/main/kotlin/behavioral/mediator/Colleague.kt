package behavioral.mediator

abstract class Colleague {
    var mediator: Mediator
    var lastMessage: String = ""

    constructor (mediator: Mediator) {
        this.mediator = mediator
    }

    fun send(message: String) {
        mediator.write(message, this);
    }

    fun notify(message: String) {
        lastMessage = message
        println(lastMessage)
    }
}