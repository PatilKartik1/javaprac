// Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display
// the contents of the List using an Iterator.

import java.util.LinkedList;
import java.util.Iterator;

public class FruitList {
    public static void main(String[] args) {
        // Create LinkedList to store fruit names
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruits to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        // Display the contents of the LinkedList using an Iterator
        Iterator<String> iterator = fruits.iterator();
        System.out.println("List of Fruits:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
