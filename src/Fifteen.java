import java.util.HashSet;

public class Fifteen {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
            
        }
        Object[] elements = hashSet.toArray();

        for (int i = 0; i < elements.length; i++) {
            System.out.println("Visited : " +elements[i]);
            
        }

    }
    
}
