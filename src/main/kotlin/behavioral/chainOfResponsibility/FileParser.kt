package behavioral.chainOfResponsibility

class FileParser(override var nextParser: IMessageParser?) : IMessageParser {

    var result: String = ""

    override fun handleRequest(message: Any) {
        if (message is ByteArray) {
            //TODO something with file
            if (message.size > 1000) {
                nextParser = LargeFileParser(null)
                nextParser?.handleRequest(message)
            }
            else
                result = "message is a file"
        }
        else
            nextParser?.handleRequest(message)
    }
}