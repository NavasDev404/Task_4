import java.util.Stack;

public class IntegerStackManager {
    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStackManager() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty. No element to pop.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Method to check if the stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        IntegerStackManager manager = new IntegerStackManager();

        // Testing the methods
        manager.checkIfEmpty(); // Stack is initially empty

        manager.pushElement(10);
        manager.pushElement(20);
        manager.pushElement(30);

        manager.checkIfEmpty(); // Stack is not empty

        manager.popElement(); // Pops 30
        manager.popElement(); // Pops 20

        manager.checkIfEmpty(); // Stack is not empty

        manager.popElement(); // Pops 10
        manager.popElement(); // No elements to pop
    }
}
