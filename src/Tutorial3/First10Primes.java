package Tutorial3;
import java.util.*;
public class First10Primes {

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
        List<Integer> array = new ArrayList<>();
        int num =1 ,count = 0;
        while (count < 10) {
            if (isPrimeNumber(num)) {
                array.add(num);
                count++;
            }
            num++;
        }
        Iterator<Integer> arr = array.iterator();
//        int countIre = 0;
        while (arr.hasNext()){
            System.out.println(arr.next());
//            countIre ++;
//            System.out.println(countIre + " times iteration");
//            print value == more larger than  5
//            int element = arr.next();
            // error https://github.com/daichitt/SE1-FIT/tree/main
//            if (arr.next() > 5) {
//                System.out.println(arr.next());
//            }
        }
        System.out.println("-----------");
//        for (int nu : array) {
//            System.out.println(nu);
//        }
//        System.out.println("List Elements : " + array.size());
    }


}
// only do 1 4 5