package Tutorial2.ex4;

import java.util.Arrays;

public class combine {

//    @Override
    public static void combine(int[] a, int[] b) throws NullPointerException, IllegalArgumentException {
//        return super.hashCode();
//        if (a == null || b == null) {
//            throw new NullPointerException("Array is null");
//        }
//        if (a.length == 0 || b.length == 0) {
//            throw new IllegalArgumentException("Array is empty");
//        }
//        int[] result = {};
//
//        int sum = 0;
//        for (int num : b) {
//            sum += num;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = a[i] * sum;
//        }
//        return 0;

        if (a == null || b == null) {
            throw new NullPointerException("Input arrays must not be null");
        }
        if (b.length == 0) {
            throw new IllegalArgumentException("Array 'b' must not be empty");
        }

        if (a.length == 0) {
            throw new IllegalArgumentException("Array 'A' must not be empty");
        }

        int sumB = 0;
        for (int value : b) {
            sumB += value;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] *= sumB;
        }



    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5};

        System.out.println("Before combine:");
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        combine(a, b);

        System.out.println("After combine:");
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));


        // Test with empty 'a'
        int[] emptyA = {};
        combine(emptyA, b);
        System.out.println("Empty a after combine: " + Arrays.toString(emptyA));

//         Test with null arrays (will throw exceptions)
        try {
            combine(null, b);
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            combine(a, new int[]{});
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
