public class Stack<T> {
    private SinglyLinkedListGeneric<T> stack;

    public Stack() {
        stack = new SinglyLinkedListGeneric<>();
    }

    public void push(T key) {
        stack.pushFront(key);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        T topElement = stack.topFront(); // Retrieve the top element
        stack.popFront(); // Remove the top element from the stack

        return topElement; // Return the retrieved element
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.topFront();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        stack.display();
    }
}
