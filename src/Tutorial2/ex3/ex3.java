package Tutorial2.ex3;

import Tutorial2.ex2.ex2;

public class ex3 {

    public static int sumArrayReturnZero(int[] arr) throws NullPointerException  {
        if (arr == null) {
            throw new NullPointerException("Array is null");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int sumArrayThrowException(int[] arr) throws NullPointerException, IllegalArgumentException {
        if (arr == null) {
            throw new NullPointerException("Array is null");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        int[] emptyArray = {};

        System.out.println("Sum (return zero): " + sumArrayReturnZero(testArray));
        System.out.println("Sum (return zero) for empty array: " + sumArrayReturnZero(emptyArray));

        try {
            System.out.println("Sum (throw exception): " + sumArrayThrowException(testArray));
            System.out.println("Sum (throw exception) for empty array: " + sumArrayThrowException(emptyArray));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
