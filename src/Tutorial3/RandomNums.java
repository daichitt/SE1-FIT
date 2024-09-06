package Tutorial3;
import java.util.*;

public class RandomNums {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> array = new ArrayList<>();
        int len = 10;
        for (int i = 0; i < len; len--){
            int rand_int1 = rand.nextInt(100);
            array.add(rand_int1);
        }
        Iterator<Integer> ite = array.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }


    }
}
