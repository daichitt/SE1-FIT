package Tutorial2.ex5;

import java.util.Arrays;

public class ex5 {

    public static void divide(int[] a, int[] b) throws IndexOutOfBoundsException, ArithmeticException, NullPointerException {

        if (a == null || b == null) {
            throw new NullPointerException("Input arrays must not be null");
        }

        if (b.length != a.length) {
            throw new ArithmeticException("Array 'b' must be the same length as array 'a'");
        }

        int[] result = new int[b.length]; //
        for (int i = 0; i < b.length;  i++) {
            if (a[i] > b[i]) {
                throw new ArithmeticException("Array 'b' must not larger than A");
            }
            result[i] = b[i] / a[i];
        }
        System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args) {
        int[] arrA = {3,5,7,8};
        int[] arrB = {6,15,21,24};
        try {
            divide(arrA, arrB);
        } catch (Exception e){
            System.out.println("Err" + e);
        }


    }
}
