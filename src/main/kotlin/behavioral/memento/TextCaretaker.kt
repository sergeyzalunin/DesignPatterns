package behavioral.memento

import java.util.*

class TextCaretaker {
    private val textStack = Stack<TextMemento>()

    fun save(textMemento: TextMemento) {
        textStack.push(textMemento)
    }

    fun getLast(): TextMemento? {
        if (textStack.empty()) return null
        return textStack.pop()
    }
}