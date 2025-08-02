import java.util.LinkedList;
        
public class LinkedListDemo {
    public static void main(String [] str){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");        
        linkedList.add("Java");
        linkedList.add("Programming");  
        // Print the LinkedList --> through reference variable
        System.out.println("LinkedList: " + linkedList);

        // Printing linkedlist using for-each loop
        System.out.println("Using for loop:");
        for(String item: linkedList) {
            System.out.println(item);
        }   

        // add an element at the beginning
        linkedList.addFirst("Start");
        System.out.println("After adding 'Start' at the beginning: " + linkedList);

        // add an element at the end
        linkedList.addLast("End");
        System.out.println("After adding 'End' at the end: " + linkedList);

        // update an element
        linkedList.set(2, "Python");
        System.out.println("After updating position 2: " + linkedList);

        // remove an element
        linkedList.remove(1);   
        System.out.println("After removing element at position 1: " + linkedList);

        linkedList.remove("Hello");
        System.out.println("After removing 'Hello': " + linkedList);

        

    }
}
