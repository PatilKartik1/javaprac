// Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display
// the contents of the List in reverse order using an appropriate interface

import java.util.LinkedList;
import java.util.ListIterator;

public class FruitLinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList to store names of fruits
        LinkedList<String> fruits = new LinkedList<>();
        
        // Adding fruits to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");
        
        // Displaying the contents of the list in reverse order using ListIterator
        ListIterator<String> listIterator = fruits.listIterator(fruits.size());
        
        System.out.println("Fruits in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
