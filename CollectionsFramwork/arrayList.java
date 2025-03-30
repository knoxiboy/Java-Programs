package CollectionsFramwork;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>(4);

        // adding elements
        l1.add(12);
        l1.add(32);
        l1.add(79);
        l1.add(1,19);

        l2.add(12);
        l2.add(14);
        l2.add(1,13);

        System.out.println("ArrayList1 : " + l1);
        System.out.println("ArrayList2 : " + l2);

        // accessing elements
        System.out.println("Element at index 2 of ArrayList1: "+l1.get(2));
        System.out.println("Element at index 2 of ArrayList2: "+l2.get(2));

        // removing elements
        l1.remove(2);
        System.out.println("New ArrayList1 : " + l1);

        // changing elements
        l1.set(0, 21);
        System.out.println("New ArrayList1 : " + l1);

        // checking if an ArrayList contains a specific value or not 
        System.out.println(l1.contains(79));
        System.out.println(l1.contains(32));

        // Merging two ArrayLists
        l1.addAll(l2);
        System.out.println("New ArrayList1 : " + l1);

        // other methods

        l1.indexOf(19); //finding the first occurrence of a specified number in the ArrayList 

        l1.removeAll(l2); //removes all elements of a arraylist matching with another
        System.out.println("New ArrayList1 : " + l1);

        l2.removeAll(l2); //(or)
        l2.clear(); // both will delete all elements from the arraylist
        System.out.println("New ArrayList2 : " + l2);

        System.out.println(l2.isEmpty()); //to cheack is an arraylist is empty or not
        System.out.println(l1.isEmpty());

        l1.sort(null);
        System.out.println("New ArrayList1 : " + l1);

        System.out.println(l1.clone());
    }
}