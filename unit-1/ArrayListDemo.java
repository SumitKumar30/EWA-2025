import java.util.ArrayList;
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
        list.clear();

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
        
    }
}