import java.util.LinkedList;

public class Fourteen {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        } 
        System.out.println("Original List : " +list);
        list.set(2, 25);
        System.out.println("\nUpdated List : " +list);
    }
    
}
