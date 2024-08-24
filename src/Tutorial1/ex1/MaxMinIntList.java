package Tutorial1.ex1;
import java.util.ArrayList;
import java.util.Collections;
public class MaxMinIntList extends ArrayList<Integer> {

    public Integer min () {
        if (this.isEmpty()) {
            throw new IllegalStateException("The list is empty.");
        }
        return Collections.min(this);
    }
    public Integer max () {
        if (this.isEmpty()) {
            throw new IllegalStateException("The list is empty.");
        }

        return Collections.max(this);
    }


    public static void main(String[] args) {

        MaxMinIntList list = new MaxMinIntList();
        // Adding elements to the list
        list.add(10);
        list.add(3);
        list.add(50);
        list.add(21);
        list.add(7);

        // Testing the min and max methods
        System.out.println("Minimum value in the list: " + list.min());
        System.out.println("Maximum value in the list: " + list.max());




    }
}
