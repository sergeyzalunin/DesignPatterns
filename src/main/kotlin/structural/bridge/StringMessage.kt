package structural.bridge

class StringMessage : Message() {
    override fun send(fromMessenger : String) {
        this.testMessage = String.format("%s from %s", "StringMessage", fromMessenger)
    }
}