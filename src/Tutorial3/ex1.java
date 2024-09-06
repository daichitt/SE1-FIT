package Tutorial3;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;

public class ex1 {

    public static void printIte(Iterator it) {
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "PHP", "C++"));
        LinkedList<Character> linkedlist = new LinkedList<>(Arrays.asList('a', 'i', 'u', 'e', 'o'));
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,3,5));

        Map<String, String> map = new HashMap<>();
        map.put("apple", "リンゴ");
        map.put("orange", "みかん");
        map.put("grape", "ぶどう");

        printIte(list.iterator());
        printIte(linkedlist.iterator());
        printIte(set.iterator());
        printIte(map.entrySet().iterator());



    }

}
