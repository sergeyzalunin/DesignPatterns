package structural.bridge

abstract class Message {
    var testMessage : String = ""
    abstract fun send(fromMessenger : String)
}