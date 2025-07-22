package CollectionsFramwork;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // create a hashmap
        HashMap<String, Integer> numbers = new HashMap<>();

        System.out.println("Initial HashMap: " + numbers);
        // put() method to add elements
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

        // get() method to get value
        System.out.println("Value for key 'Two': " + numbers.get("Two"));

        // containsKey() method to check if a key exists
        System.out.println("Does key 'Three' exist? " + numbers.containsKey("Three"));

        // remove() method to remove an element
        numbers.remove("One");
        System.out.println("HashMap after remove('One'): " + numbers);

        // size() method to get the number of key/value pairs
        System.out.println("Size of HashMap: " + numbers.size());

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + numbers.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // clear() method to remove all elements
        numbers.clear();
        System.out.println("HashMap after clear(): " + numbers);

        // isEmpty() method to check if the map is empty
        System.out.println("Is HashMap empty? " + numbers.isEmpty());

        // putAll() method to copy all mappings from another map
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Four", 4);
        anotherMap.put("Five", 5);

        numbers.putAll(anotherMap);
        System.out.println("HashMap after putAll(): " + numbers);

        // put only if key is not already associated with a value
        numbers.putIfAbsent("Six", 6);
        System.out.println("HashMap after putIfAbsent('Six', 6): " + numbers);

        // iterate over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : numbers.keySet()) {
            System.out.println("Key: " + key + ", Value: " + numbers.get(key));
        }

        //get or default value
        System.out.println("Value for key 'Seven' or default 0: " + numbers.getOrDefault("Seven", 0));
    }
}
