interface Stack<T : Any> {
    fun push(element: T)
    fun pop(): T?
}

class StackImpl<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

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
        if (storage.isEmpty()) return null
        return storage.removeAt(storage.size - 1)
    }
}