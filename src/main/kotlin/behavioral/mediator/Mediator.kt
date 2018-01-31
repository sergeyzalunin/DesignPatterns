package behavioral.mediator

abstract class Mediator {
    abstract fun write(message : String, colleague: Colleague)
}