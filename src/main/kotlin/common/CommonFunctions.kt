package common

infix fun String.xor(value: Int) : String {
    var result = ""

    for (letter in this) {
        result +=  (letter.toInt() xor value).toChar()
    }
    return result;
}