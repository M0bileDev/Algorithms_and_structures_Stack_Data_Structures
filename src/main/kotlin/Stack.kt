interface Stack<T : Any> {
    fun push(element: T)
    fun pop(): T?
    fun peek(): T?

    val count: Int

    val isEmpty: Boolean
        get() = count == 0
}

class StackImpl<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

    companion object {
        fun <T : Any> create(items: Iterable<T>): Stack<T> {
            val stack = StackImpl<T>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }

        fun <T : Any> stackOf(vararg elements: T): Stack<T> {
            return create(elements.asList())
        }
    }

    override fun toString() = buildString {
        appendLine("-----top-----")
        storage.asReversed().forEach {
            appendLine(it)
        }
        appendLine("-----bottom-----")
    }

    //O(1) time complexity
    override fun push(element: T) {
        storage.add(element)
    }

    //O(1) time complexity
    override fun pop(): T? {
        if (isEmpty) return null
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size
}

fun String.checkParentheses(): Boolean {
    val stack = StackImpl<Char>()

    for (character in this) {
        when (character) {
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty) {
                return false
            } else {
                stack.pop()
            }
        }
    }
    return stack.isEmpty
}