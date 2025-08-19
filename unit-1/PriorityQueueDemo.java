import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // create a priority queue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // add elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(40);
        System.out.println("Priority Queue after adding elements: " + priorityQueue);

        // remove the head of the priority queue
        Integer removedElement = priorityQueue.remove(); // removes the head of the queue
        System.out.println("Removed element: " + removedElement);
    }
}
