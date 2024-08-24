package Tutorial1.ex2;

public class Counter {

    int count;


    /**
     * Effects: Makes count contain 0
     */
    public Counter(){
        count = 0;
    }
    /**
     *
     * Effects: Returns the value of count
     */
    public int get() {
        return count;

    }
    /**
     * Effects: Increments the value of count
     */
    public void incr(){
        count+=1;
    }




    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 1; i <= 100; i++){
            counter.incr();
        }

        System.out.println("counter.get() is " + counter.get());






    }
}
