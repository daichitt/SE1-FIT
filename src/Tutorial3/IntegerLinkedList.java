package Tutorial3;
import java.util.*;

public class IntegerLinkedList extends LinkedList<Integer> {
    public Iterator<Integer> evenIterator() {
        return new Generater();
    }
    private class Generater implements Iterator {
        int nextIndex = 0;
        @Override
        public boolean hasNext() {
            while (nextIndex < size()) {
                if (get(nextIndex) % 2 == 0) {
                    return true;
                }
                nextIndex++;
            }
            return false;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return get(nextIndex++);
        }
    }

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(6);
        System.out.println(list.size());
        // Use the evenIterator to print even numbers
        Iterator<Integer> evenIterator = list.evenIterator();
        while (evenIterator.hasNext()) {
            System.out.print(evenIterator.next() + " ");
        }
    }
}
