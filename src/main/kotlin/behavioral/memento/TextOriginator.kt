package behavioral.memento

class TextOriginator {
    var text: String = ""

    fun createTextMemento(): TextMemento {
        return TextMemento(text)
    }

    fun restoreFromTextMemento(memento: TextMemento?) {
        text = memento?.text!!
    }
}