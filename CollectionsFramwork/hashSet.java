package CollectionsFramwork;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);

        // to print the hashset
        System.out.println("myHashSet : " + myHashSet);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        // to check if the hashset is empty
        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());

        // to check the length of the hashset
        System.out.println("The size of myHashSet is : " + myHashSet.size());

        // to remove an element from the hashset
        myHashSet.remove(8);
        System.out.println("myHashSet after removing 8 : " + myHashSet);
        
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);

        //is element already in set
        System.out.println(myHashSet.contains(6));

        // to check if two hashsets are equal
        HashSet<Integer> myHashSet3 = new HashSet<>();
        myHashSet3.add(6);
        myHashSet3.add(8);
        myHashSet3.add(3);
        myHashSet3.add(11);
        System.out.println("myHashSet is equal to myHashSet3 : " + myHashSet.equals(myHashSet3));
        // to check if one hashset is a subset of another
        HashSet<Integer> myHashSet4 = new HashSet<>();
        myHashSet4.add(6);
        myHashSet4.add(8);
        myHashSet4.add(3);
        System.out.println("myHashSet4 is a subset of myHashSet3 : " + myHashSet3.containsAll(myHashSet4));
    }
}
