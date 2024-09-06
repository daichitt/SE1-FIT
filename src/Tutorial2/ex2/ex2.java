package Tutorial2.ex2;

import java.util.ArrayList;
import java.util.List;

public class ex2 {

//    public static  int search(int[] a,  int x) {
//
//        try {
//
//        }catch () {
//
//
//        }
//    }
// Implementation using for loop
public static int searchWithForLoop(int[] a, int x) throws NullPointerException, NotFoundException {
    if (a == null) {
        throw new NullPointerException("Array is null");
    }
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            return i;
        }
    }
    throw new NotFoundException("Element not found in array");
}


    public static int searchWithWhileLoop(int[] a, int x) throws NullPointerException, NotFoundException {
        if (a == null) {
            throw new NullPointerException("Array is null");
        }
        int i = 0;
        while (true) {
            try {
                if (a[i] == x) {
                    return i;
                }
                i++;
            } catch (IndexOutOfBoundsException e) {
                throw new NotFoundException("Element not found in array");
            }
        }
    }

    // Custom exception class
    public static class NotFoundException extends Exception {
        public NotFoundException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) {

        int[] testArray = {1, 3, 5, 7, 9};

        try {
            System.out.println("For loop result: " + searchWithForLoop(testArray, 5));
            System.out.println("While loop result: " + searchWithWhileLoop(testArray, 5));

            // Test not found case
            searchWithForLoop(testArray, 6);
        } catch (NullPointerException | NotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
