// Q2. Construct a linked List containing names of colours: red, blue, yellow and orange. Then
// extend the program to do the following:
// i.Display the contents of the List using an Iterator
// ii.Display the contents of the List in reverse order using a Listlterator
// iii.Create another list containing pink and green. Insert the elements of this list between
// blue and yellow. [20 Marks]


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class ColorLinkedList {
    public static void main(String[] args) {
        // Step 1: Create the linked list and add colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Step 2: Display contents of the list using an Iterator
        System.out.println("Colors in the list:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 3: Display contents in reverse order using a ListIterator
        System.out.println("\nColors in reverse order:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Step 4: Create another list containing pink and green
        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("Pink");
        newColors.add("Green");

        // Step 5: Insert new colors between Blue and Yellow
        colors.addAll(2, newColors); // Add at index 2, after Blue

        // Step 6: Display updated list
        System.out.println("\nUpdated list after inserting pink and green:");
        iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

