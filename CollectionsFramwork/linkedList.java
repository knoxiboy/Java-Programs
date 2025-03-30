package CollectionsFramwork;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();

        // adding elements
        l1.add(12);
        l1.add(32);
        l1.add(79);
        l1.add(1,19);

        l2.add(12);
        l2.add(14);
        l2.add(1,13);

        System.out.println("LinkedList: " + l1);
        System.out.println("LinkedList: " + l2);

        // accessing elements
        System.out.println("Element at index 2 of LinkedList: "+l1.get(2));
        System.out.println("Element at index 2 of LinkedList: "+l2.get(2));

        // removing elements
        l1.remove(2);
        System.out.println("New LinkedList: " + l1);

        // changing elements
        l1.set(0, 21);
        System.out.println("New LinkedList: " + l1);

        // checking if an LinkedListontains a specific value or not 
        System.out.println(l1.contains(79));
        System.out.println(l1.contains(32));

        // Merging two LinkedList        l1.addAll(l2);
        System.out.println("New LinkedList: " + l1);

        // other methods

        l1.indexOf(19); //finding the first occurrence of a specified number in the LinkedList
        l1.removeAll(l2); //removes all elements of a LinkedListatching with another
        System.out.println("New LinkedList: " + l1);

        l2.removeAll(l2); //(or)
        l2.clear(); // both will delete all elements from the LinkedList       System.out.println("New LinkedList: " + l2);

        System.out.println(l2.isEmpty()); //to cheack is an LinkedLists empty or not
        System.out.println(l1.isEmpty());

        l1.sort(null);
        System.out.println("New LinkedList: " + l1);

        System.out.println(l1.clone());
    }
}
