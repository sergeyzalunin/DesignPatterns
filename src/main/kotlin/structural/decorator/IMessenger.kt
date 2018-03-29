package structural.decorator

interface IMessenger {
    fun sendMessage(message: String)
    fun getMessage(): String
    fun getLastMessage(): String
}