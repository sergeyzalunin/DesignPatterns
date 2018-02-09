package behavioral.chainOfResponsibility

interface IMessageParser {
    var nextParser: IMessageParser?
    fun handleRequest(message: Any)
}