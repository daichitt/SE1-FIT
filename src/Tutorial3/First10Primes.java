package Tutorial3;
import java.util.*;
public class First10Primes {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int num =1 ,count = 0;
        while (count < 10) {
            if (isPrimeNumber(num)) {
                array.add(num);
                count++;
            }
            num++;
        }

        for (Integer integer : array) {
            System.out.println(integer);
        }
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
}


// only do 1 4 5