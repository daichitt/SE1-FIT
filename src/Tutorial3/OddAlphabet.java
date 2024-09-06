package Tutorial3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class OddAlphabet {
    public static void main(String[] args) {
        // Create a list l1 to store character codes of the alphabet
        List<Integer> l1 = new ArrayList<>();

        // Fill l1 with character codes for the letters 'A' to 'Z'
        for (char c = 'A'; c <= 'Z'; c++) {
            l1.add((int) c);
        }

        // Create a second list l2 to store the odd character codes
        List<Integer> l2 = new ArrayList<>();

        // Use an Iterator to filter odd character codes from l1
        Iterator<Integer> iterator = l1.iterator();
        while (iterator.hasNext()) {
            int code = iterator.next();
            if (code % 2 != 0) {
                l2.add(code);  // Add only odd character codes to l2
            }
        }

        // Print the elements of l1 (all character codes)
        System.out.println("l1: " + l1);

        // Print the elements of l2 (only odd character codes)
        System.out.println("l2: " + l2);


    }
}
