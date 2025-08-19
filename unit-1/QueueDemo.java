import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        // create a queue of string values
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("Triple-H");
        queue.add("John Cena");
        queue.add("The Rock");
        queue.add("Stone Cold");
        queue.add("Undertaker");
        queue.add("Kane");
        System.out.println("Queue after adding elements: " + queue);

        // remove an element from the queue
        String removedElement = queue.remove(); // removes the head of the queue
        System.out.println("Removed element: " + removedElement);

        queue.offer(removedElement); // re-adding the removed element
        System.out.println("Queue after removing an element: " + queue);

        // peek at the head of the queue without removing it
        String headElement = queue.peek();      
        System.out.println("Head element after peek: " + headElement);

        // poll the head of the queue
        String polledElement = queue.poll(); // retrieves and removes the head of the queue

        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after polling an element: " + queue);

    }
}
