import java.util.Arrays;
import java.util.PriorityQueue;

public class TwentyThree {
    public static void main(String[] args) {
         PriorityQueue<Integer> p1 = new PriorityQueue<>();
        for (int i = 0; i<10 ; i++) {
            p1.add(i);
        }

        Integer[] arr = p1.toArray(new Integer[p1.size()]);
        System.out.println(Arrays.toString(arr));
        
    }
    
}
