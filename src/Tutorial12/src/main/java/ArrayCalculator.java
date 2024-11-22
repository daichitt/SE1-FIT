package Tutorial12.src.main.java;
public class ArrayCalculator {
    public static void main(String[] args) throws Exception {
//        int text = {4, };
        int[] arr = {1, 2, 3};
        arraySum(arr);

    }
    public static int arraySum(int[] array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        if (array.length == 0) {
            throw new Exception("Array is empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}