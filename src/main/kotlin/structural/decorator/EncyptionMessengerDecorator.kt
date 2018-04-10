package structural.decorator

import common.xor

class EncryptionMessengerDecorator(messenger: IMessenger) : BaseMessengerDecorator(messenger) {

    override fun sendMessage(message: String) {
        super.sendMessage(message.xor(message.length))
    }

    override fun getMessage(): String {
        var value = super.getMessage()
        return value.xor(value.length)
    }
}