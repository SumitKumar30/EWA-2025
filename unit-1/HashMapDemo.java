import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        // create a HashMap object

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Antman", 22);
        map.put("Batman", 1);
        map.put("Catwoman", 3);
        map.put("Daredevil", 4);
        map.put("Elektra", 5);
        map.put("Flash", 6);
        map.put("Green Lantern", 7);  
        map.put("Hawkeye", 8);
        map.put("Ironman", 9);
        map.put("Joker", 10);
        
        // iterator through the HashMap
        for(String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // iterator through the HashMap using entrySet
        System.out.println("Using entrySet:");
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if the HashMap contains a key
        boolean containsKey = map.containsKey("Batman");

        System.out.println("Does the HashMap contain 'Batman'? " + containsKey);

        // Check if the HashMap contains a value
        boolean containsValue = map.containsValue(22);
        System.out.println("Does the HashMap contain value 22? " + containsValue);

        // Get the size of the HashMap
        int size = map.size();

        System.out.println("Size of the HashMap: " + size);

        // Remove an entry from the HashMap
        map.remove("Antman");
        System.out.println("After removing 'Antman': " + map);  

        // Update an entry in the HashMap
        map.put("Batman", 2);   

        System.out.println("After updating 'Batman': " + map);
    }
}
