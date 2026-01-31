fun main() {
    "using a stack" example {
        val stack = StackImpl<Int>().apply {
            push(1)
            push(2)
            push(3)
            push(4)
        }
        print(stack)
        val poppedElement = stack.pop()
        if (poppedElement != null) {
            println("Popped: $poppedElement")
        }
        print(stack)
    }

}

infix fun String.example(function: () -> Unit) {
    println("\n=== Example of $this ===")
    function()
}