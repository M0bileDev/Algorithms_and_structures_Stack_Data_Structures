import StackImpl.Companion.stackOf

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

    "using a peek" example {
        val stack = StackImpl<Int>().apply {
            push(1)
            push(2)
        }
        println(stack)
        print("peek for the most top element in stack: ${stack.peek()}")
        stack.push(3)
        println("\n$stack")
        print("peek for the most top element in stack: ${stack.peek()}")
    }

    "initializing a stack from a list" example {
        val list = listOf("A", "B", "C", "D")
        val stack = StackImpl.create(list)
        print(stack)
        println("Popped: ${stack.pop()}")
        print("peek for the most top element in stack: ${stack.peek()}")
    }

    "initializing a stack from an array literal" example {
        val stack = stackOf(1.0, 2.0, 3.0, 4.0)
        print(stack)
        println("Popped: ${stack.pop()}")
        print("peek for the most top element in stack: ${stack.peek()}")
    }

}

infix fun String.example(function: () -> Unit) {
    println("\n=== Example of $this ===")
    function()
}