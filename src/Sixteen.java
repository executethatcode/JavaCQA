import java.util.HashSet;

public class Sixteen {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(i);
            
        }
        System.out.println("Original Hash set : " +hashSet);
        hashSet.clear();
        System.out.println("\nUpdated Hash set : " +hashSet);

    }
    
}
