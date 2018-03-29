package structural.decorator

class EncryptionMessengerDecorator(messenger: IMessenger) : BaseMessengerDecorator(messenger) {

    override fun sendMessage(message: String) {
        super.sendMessage(message.xor(message.length))
    }

    override fun getMessage(): String {
        var value = super.getMessage()
        return value.xor(value.length)
    }

    private infix fun String.xor(value: Int) : String {
        var result = ""

        for (letter in this) {
            result +=  (letter.toInt() xor value).toChar()
        }
        return result;
    }
}