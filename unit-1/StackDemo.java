import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        // create a stack of Strings
        Stack<String> stack = new Stack<>();

        // push elements onto the stack
        stack.push("Iron Man");
        stack.push("Captain America");
        stack.push("Thor");
        stack.push("Hulk");
        stack.push("Black Widow");
        System.out.println("Stack after pushing elements: " + stack);

        // pop an element from the stack
        String poppedElement = stack.pop(); // element at the top of the stack
        System.out.println("Popped element: " + poppedElement);

        System.out.println("stack after popping an element: " + stack);

        // peek at the top element of the stack without removing it
        String topElement = stack.peek();
        System.out.println("Top element after peek: " + topElement);

        // check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // check the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}
