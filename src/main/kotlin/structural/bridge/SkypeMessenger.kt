package structural.bridge

class SkypeMessenger : Messenger() {
    override fun send(message: Message) {
        message.send("Skype")
    }
}