import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");  
        list.add("Java");
        list.add("Programming");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Printing arraylists using for loop
        System.out.println("Using for loop:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // printing arraylists using for-each loop
        System.out.println("Using for-each loop:");
        for(String item : list) {
            System.out.println(item);
        }

        // update an element
        list.set(2, "Python");
        System.out.println("After updating index 2: " + list);

        // remove an element
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        list.remove("Hello");
        System.out.println("After removing 'Hello': " + list);

        // create a new arraylis of type Integer
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer ArrayList: " + intList);

        // Check if the list contains an element
        boolean containsJava = list.contains("Python");
        System.out.println("Does the list contain 'Python'? " + containsJava);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // Clear the ArrayList
        // list.clear();

        System.out.println("ArrayList after clearing: " + list);
        
        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();   
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // create a new ArrayList with initial capacity
        ArrayList<String> newList = new ArrayList<>(5);

        newList.add("Initial");
        System.out.println("New ArrayList with initial capacity: " + newList);
        
        // convert ArrayList to array
        String[] array = new String[newList.size()];
        newList.toArray(array);
        System.out.println("Array converted from ArrayList: ");
        for(String str : array) {
            System.out.println(str);
        }   

        // Iterators in ArrayList
        System.out.println("Using Iterator:");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // modify or add elements in my list using for-each loop
        System.out.println("Modifying elements using for-each loop:");
        for(String item : list) {
            if(item.equals("Python")) {
                System.out.println("Found Python, modifying it.");
                list.set(list.indexOf(item), "JavaScript");
            } else {
                System.out.println("Current item: " + item);
            }
        }
        System.out.println("ArrayList after modification: " + list); 
        
        // REMOVE a new element using for-each loop to show concurrent modification exception
        // Note: This will throw ConcurrentModificationException
        // System.out.println("Removing elements using for-each loop:");
        // for(String item : list){
        //     if(item.equals("JavaScript")) {
        //         System.out.println("Found JavaScript, removing it.");
        //         list.remove(item);
        //     } 
        //     list.add("Hello Again"); // This will cause ConcurrentModificationException
        // }
        // add few elements to the list again
        list.add("Php");
        list.add("Ruby");

        // modify the list using an iterator
        System.out.println("Modifying elements using Iterator:");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String current = iterator.next();
            if(current.equals("JavaScript")) {
                System.out.println("Found JavaScript, removing it.");
                iterator.remove(); // Safe removal using iterator
            } 
            // iterator.next(); // This will not cause ConcurrentModificationException
            System.out.println("Current item: " + current);
        }
    }
}