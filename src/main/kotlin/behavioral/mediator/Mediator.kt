package behavioral.mediator

import behavioral.mediator.Colleague

abstract class Mediator {
    abstract fun write(message : String, colleague: Colleague)
}