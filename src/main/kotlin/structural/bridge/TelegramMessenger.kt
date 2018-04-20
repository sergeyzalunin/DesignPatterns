package structural.bridge

class TelegramMessenger : Messenger() {
    override fun send(message: Message) {
        message.send("Telegram")
    }
}