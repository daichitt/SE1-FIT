package Tutorial3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimeLinkedList extends LinkedList<Integer> {

    public Iterator<Integer> primeIterator() {
        List<Integer> primeElements = new LinkedList<>(); // List to hold even numbers
        for (Integer num : this) {
            if(isPrimeNumber(num)) {
                primeElements.add(num);
            }
        }
        return primeElements.iterator();

    }

    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        boolean flag = true;
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        PrimeLinkedList list = new PrimeLinkedList();
        int n = 50;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        Iterator<Integer> prime = list.primeIterator();
        while (prime.hasNext()){
            System.out.println(prime.next());
        }

    }
}
