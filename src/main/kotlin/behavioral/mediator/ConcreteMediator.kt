package behavioral.mediator

class ConcreteMediator: Mediator() {

    lateinit var collegue1: ConcreteCollegue1
    lateinit var collegue2: ConcreteCollegue2

    override fun write(message: String, colleague: Colleague) {
        if (colleague == collegue1) {
            collegue2.notify(message)
        } else if (colleague == collegue2) {
            collegue1.notify(message)
        } else {
            throw IllegalArgumentException("Colleague did not equals ConcreteCollegue1 or ConcreteCollegue2");
        }
    }

}