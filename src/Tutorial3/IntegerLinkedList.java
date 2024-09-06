package Tutorial3;
//import java.util*;
//import java.util.Iterator;
//import java.util.List;

import java.util.*;

public class IntegerLinkedList extends LinkedList<Integer> {
    // Method to return an iterator that iterates over only even elements
    public Iterator<Integer> evenIterator() {
        List<Integer> evenElements = new LinkedList<>(); // List to hold even numbers

        // Filter even numbers from the original list
        for (Integer num : this) {
            if (num % 2 == 0) {
                evenElements.add(num); // Add even numbers to the new list
            }
        }

        // Return an iterator for the list of even numbers
        return evenElements.iterator();
    }

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Use the evenIterator to print even numbers
        Iterator<Integer> evenIterator = list.evenIterator();
        while (evenIterator.hasNext()) {
            System.out.print(evenIterator.next() + " ");
        }

    }
}
