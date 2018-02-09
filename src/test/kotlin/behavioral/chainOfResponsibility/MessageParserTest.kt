package behavioral.chainOfResponsibility

import org.junit.Before
import org.junit.Test

class MessageParserTest {

    @Before
    fun prepareTest() {

    }

    @Test
    fun parseTextTest() {

        val fileParser = FileParser(null)
        val textParser = TextParser(fileParser)
        textParser.handleRequest("some text")
        assert(textParser.result == "message is a text")
    }

    @Test
    fun parseFileTest() {

        val fileParser = FileParser(null)
        val textParser = TextParser(fileParser)
        textParser.handleRequest(ByteArray(100))
        assert(fileParser.result == "message is a file")
    }

    @Test
    fun parseLargeFileTest() {

        val fileParser = FileParser(null)
        val textParser = TextParser(fileParser)
        textParser.handleRequest(ByteArray(2000))
        assert((fileParser.nextParser as LargeFileParser).result == "message is a large file")
    }
}