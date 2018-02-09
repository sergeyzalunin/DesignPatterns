package behavioral.chainOfResponsibility

class LargeFileParser(override var nextParser: IMessageParser?) : IMessageParser {

    var result: String = ""

    override fun handleRequest(message: Any) {
        if (message is ByteArray) {
            //TODO something with file
            result = "message is a large file"
        }
        else
            nextParser?.handleRequest(message)
    }
}