package behavioral.chainOfResponsibility

class TextParser(override var nextParser: IMessageParser?) : IMessageParser {

    var result: String = ""

    override fun handleRequest(message: Any) {
        if (message is String) {
            //TODO something with text
            result = "message is a text"
        }
        else
            nextParser?.handleRequest(message)
    }
}