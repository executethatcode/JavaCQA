import java.util.PriorityQueue;

public class TwentyOne {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        for (int i = 0; i<10 ; i++) {
            p1.add(i);
        }
        System.out.println("Original Queue : " +p1);
        p1.clear();
        System.out.println("Updated Queue : " +p1);

    }
    
}
