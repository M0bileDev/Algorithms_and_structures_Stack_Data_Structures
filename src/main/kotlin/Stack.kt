interface Stack<T : Any> {
    fun push(element: T)
    fun pop(): T?
}

class StackImpl<T: Any>: Stack<T>{
    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("-----top-----")
        storage.asReversed().forEach {
            appendLine(it)
        }
        appendLine("-----bottom-----")
    }

    override fun push(element: T) {
        TODO("Not yet implemented")
    }

    override fun pop(): T? {
        TODO("Not yet implemented")
    }
}